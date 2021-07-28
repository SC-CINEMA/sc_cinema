package scc.mvc.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scc.mvc.movie.domain.Movie;
import scc.mvc.movie.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	MovieRepository movieRepository;
	
	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public void enroll(Movie movie) {

		Movie dbMovie = new Movie(null, movie.getMovieName(), movie.getMovieRate(), movie.getMovieRunningtime()
				,movie.getMovieOpenDate(), movie.getMovieDistribution(), movie.getMovieTotalAudience()
				,movie.getMovieGenre(), null, movie.getMovieIntro(),movie.getMoviePoster());
		
		movieRepository.save(dbMovie);

	}

	@Override
	public List<Movie> showAll() {
		return movieRepository.findAll();
	}

	@Override
	public Movie detailView(Long movieCode) {
		return movieRepository.findById(movieCode).orElse(null);
	}

}
