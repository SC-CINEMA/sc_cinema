package scc.mvc.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scc.mvc.cinema.domain.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

}
