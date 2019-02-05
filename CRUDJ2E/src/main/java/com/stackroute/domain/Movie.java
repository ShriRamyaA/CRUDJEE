package com.stackroute.domain;

public class Movie {

	private String movieid;
	private String movieName;
	private String movieGenre;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieid, String movieName, String movieGenre) {
		super();
		this.movieid = movieid;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
	}
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", movieName=" + movieName + ", movieGenre=" + movieGenre + "]";
	}
	
	
	
	
}
