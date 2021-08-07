package scc.mvc.order;

public interface OrderService {

	Order createOrder(String movieName, 
			Long theaterId, Long cinemaId, 
			int seatNumber, String rsTime);
}
