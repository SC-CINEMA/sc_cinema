package scc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import scc.mvc.movie.domain.Movie;
import scc.mvc.movie.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {

	MovieService movieService;
	
	@Autowired
	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}


	@RequestMapping("/detail/{movieCode}")
	public String read(@PathVariable Long movieCode, Model model) {
		
		Movie saveMovie = movieService.detailView(movieCode);
		model.addAttribute("saveMovie", saveMovie);
		
		return "read";
	}
	
	@GetMapping("/info")
	public String info() {
		return "info";
	}
	

	
}
