package scc.mvc.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,
	generator = "Order_SEQ_GENERATOR")
	private Long orderId;
	private String movieName;
	private Long theaterId;
	private Long cinemaId;
	private int seatNumber;
	private String rsTime;
	

	public Order(Long orderId, String movieName, Long theaterId, Long cinemaId, int seatNumber, String rsTime) {
		super();
		this.orderId = orderId;
		this.movieName = movieName;
		this.theaterId = theaterId;
		this.cinemaId = cinemaId;
		this.seatNumber = seatNumber;
		this.rsTime = rsTime;
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Long getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}
	public Long getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getRsTime() {
		return rsTime;
	}
	public void setRsTime(String rsTime) {
		this.rsTime = rsTime;
	}
	

	
}
