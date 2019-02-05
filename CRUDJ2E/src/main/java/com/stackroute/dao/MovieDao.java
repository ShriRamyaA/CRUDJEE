package com.stackroute.dao;

import java.util.List;

import com.stackroute.domain.Movie;

public interface MovieDao {

	public List<Movie> getAllMovies() ;
	public Movie saveMovie(Movie movieObj);
	public Movie updateMovie(Movie movieObj);
	public String deleteMovie(String movieId);
	
}
