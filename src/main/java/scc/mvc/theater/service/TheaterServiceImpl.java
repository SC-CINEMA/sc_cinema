package scc.mvc.theater.service;

import org.springframework.beans.factory.annotation.Autowired;

import scc.mvc.theater.domain.Theater;
import scc.mvc.theater.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {

	TheaterRepository theaterRepository;
	
	@Autowired
	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		super();
		this.theaterRepository = theaterRepository;
	}

	@Override
	public void enroll(Theater theater) {

		theaterRepository.save(theater);
		
	}

}
