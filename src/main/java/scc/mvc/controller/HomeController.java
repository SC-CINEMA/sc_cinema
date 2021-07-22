package scc.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import scc.mvc.movie.domain.Movie;
import scc.mvc.movie.service.MovieService;
import scc.mvc.movie.service.MovieServiceImpl;

@Controller
public class HomeController {
	@Autowired
	MovieService movieService;
	
	


	@GetMapping("/")
	public String index(Model model) {
		List<Movie> list = movieService.ShowAll();
		for(Movie movie : list) {
			System.out.println(movie.getMovieName());
			System.out.println(1);
		}
		model.addAttribute("list", list);
		return "index";
	}
}
