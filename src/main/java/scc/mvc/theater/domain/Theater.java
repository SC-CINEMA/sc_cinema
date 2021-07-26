package scc.mvc.theater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,
	generator = "THEATER_SEQ_GENERATOR")
	private Long theaterId;
	private String theaterName; 
	private String theaterCall;
	
	
	public Long getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCall() {
		return theaterCall;
	}
	public void setTheaterCall(String theaterCall) {
		this.theaterCall = theaterCall;
	}
	
	
	
}

