package com.demo.Test.movie;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieMapper implements RowMapper<Movie> {

	public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
		Movie movie = new Movie();
		movie.setName(resultSet.getString("name"));
		movie.setYear(resultSet.getInt("year"));
		movie.setRating(resultSet.getInt("rating"));
		return movie;
	}
}
