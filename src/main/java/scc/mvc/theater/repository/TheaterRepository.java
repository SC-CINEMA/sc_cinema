package scc.mvc.theater.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scc.mvc.theater.domain.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long>{

	
}
