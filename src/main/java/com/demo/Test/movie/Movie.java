package com.demo.Test.movie;

public class Movie {
	
	public String name;
	public int year;
	public int rating;

	public Movie() {
	}
	public Movie(String name, int year, int rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
