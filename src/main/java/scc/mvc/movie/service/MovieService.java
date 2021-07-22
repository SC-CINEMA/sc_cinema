package scc.mvc.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scc.mvc.movie.domain.Movie;

public interface MovieService {
	
	//등록서비스
	public void Enroll(Movie movie);
	public List<Movie> ShowAll();  

}
