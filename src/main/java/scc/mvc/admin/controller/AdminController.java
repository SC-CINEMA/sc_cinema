package scc.mvc.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scc.mvc.movie.domain.Movie;
import scc.mvc.movie.service.MovieService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	MovieService movieService;
	
	@RequestMapping("/createForm")
	public String createMovieForm() {
		return "admin/movieForm";
	}
	
	@RequestMapping("/register")
	public String registerMovie(Movie movie) {
		movieService.Enroll(movie);
		
		return "index";
	}
}
