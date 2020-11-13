package com.demo.Test.movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

@Autowired
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
}

@PostConstruct
public void createTable() {
	jdbcTemplate.execute("CREATE TABLE movies (id bigint auto_increment primary key, name VARCHAR(50), year int, rating int)");
}

public void createMovie(String name, int year, int rating) {
	jdbcTemplate.update("insert into movies(name, year, rating) values(?, ?, ?)");
}

public List<Movie> findMoviesByName(String likeName) {
	String query="select * from movies where name like :nm";
	Map<String,Object> params = new HashMap<String,Object>();
    params.put("nm", likeName+"%");
    return jdbcTemplate.query(query, new MovieMapper(), params);
}

public static void main(String[] args) {
	AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
	config.register(MovieConfig.class);
	config.refresh();
	MovieRepository repository = config.getBean(MovieRepository.class);
	
	repository.createMovie("Some movie", 1974, 3);
	repository.createMovie("Some other movie", 1993, 2);
	
	List<Movie> movies = repository.findMoviesByName("Some%");
	for(Movie movie : movies) {
	System.out.println(movie.name + " - " + movie.year + " - " + movie.rating);
	}
  }

}
