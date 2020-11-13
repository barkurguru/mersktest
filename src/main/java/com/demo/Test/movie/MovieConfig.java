package com.demo.Test.movie;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@Import(MovieRepository.class)
class MovieConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	 }
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DriverManagerDataSource ds) {
		return new JdbcTemplate(ds);
	}

}

