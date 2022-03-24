package objectOrientedSoftwareDesignHW;

import java.util.Date;
import java.util.List;

public class FlightManager {
	private List<Flight> flights;
	
	public FlightManager() {
		
	}
	
	public void createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int numOfPassengers) {
		flights.add(FlightFactory.createFlight(type, airline, origin, destination, flightNumber, departureTime, numOfPassengers));
	}
	
	public Flight getFlightByNumber(String flightNum){
		for(Flight f : flights) {
			if(flightNum.equals(f.getFlightNumber())) {
				return f;
			}
		}
		try {
			throw new BadFlightNumException("Flight Number Not Found");
		}
		catch(BadFlightNumException e) {
			e.printStackTrace();
			Flight nf = new null;
			return nf;
		}
	}
}