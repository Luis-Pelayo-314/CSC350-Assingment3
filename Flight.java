package objectOrientedSoftwareDesignHW;


import java.util.Date;

public abstract class Flight {
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private String flightNumber;
	private Date departureTime;
	private int numOfPassengers;
	
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
	
	public String toString() {
		System.out.println(airline.getName());
		System.out.println(origin.getName());
		System.out.println(destination.getName());
		System.out.println(flightNumber);
		System.out.println(departureTime);
		System.out.println(numOfPassengers);
		return "";
	}
}

