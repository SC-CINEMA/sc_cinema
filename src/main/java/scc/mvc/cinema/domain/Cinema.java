package scc.mvc.cinema.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cinema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,
	generator = "CINEMA_SEQ_GENERATOR")
	private Long cinemaNumber;
	private String cinemaName;
	private Long cinemaSeat;
	
	
	public Long getCinemaNumber() {
		return cinemaNumber;
	}
	public void setCinemaNumber(Long cinemaNumber) {
		this.cinemaNumber = cinemaNumber;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public Long getCinemaSeat() {
		return cinemaSeat;
	}
	public void setCinemaSeat(Long cinemaSeat) {
		this.cinemaSeat = cinemaSeat;
	}

	
}
