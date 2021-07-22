package scc.mvc.movie.service;

import java.util.List;

import scc.mvc.movie.domain.Movie;

public interface MovieService {
	
	//등록서비스
	public void Enroll(Movie movie);
	public List<Movie> ShowAll();  
	
}
