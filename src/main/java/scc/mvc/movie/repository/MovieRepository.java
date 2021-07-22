package scc.mvc.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scc.mvc.movie.domain.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long> {
	

	
}
