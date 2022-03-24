package objectOrientedSoftwareDesignHW;

import java.util.Date;


public class CommercialFlight extends Flight {
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private String flightNumber;
	private Date departureTime;
	private int numOfPassengers;
	
	public CommercialFlight() {
		
	}
	
	public CommercialFlight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime, int numOfPassengers){
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.numOfPassengers = numOfPassengers;
	}
	
	public Airline getAirline() {
		return airline;
	}
	
	public Airport getOrigin(){
		return origin;
	}
	
	public Airport getDestintation() {
		return destination;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public Date getDTime() {
		return departureTime;
	}
	
	public int getNumPassengers() {
		return numOfPassengers;
	}
	
}
