package objectOrientedSoftwareDesignHW;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FlightFactory {
	
	public static Map<String, Airline> airlineCache = new HashMap<String, Airline>();
	public static Map<String, Airport> airportCache = new HashMap<String, Airport>();
	
	public static Flight createFlight(String type, String a, String o, String d, String flightNumber, Date departureTime, int numOfPassengers) {
		Flight f;
		
		Airline airline;
		Airport origin;
		Airport destination;
		
		if(airlineCache.containsKey(a)) {
			airline = airlineCache.get(a);
		}
		else {
			airline = new Airline(a);
			airlineCache.put(a, airline);
		}
		
		if(airportCache.containsKey(o)) {
			origin = airportCache.get(o);
		}
		else {
			origin = new Airport(o);
			airportCache.put(o, origin);
		}
		
		if(airportCache.containsKey(d)) {
			destination = airportCache.get(d);
		}
		else {
			destination = new Airport(d);
			airportCache.put(d, destination);
		}
		
		
		if(type.equals("commercial")) {
			f = new CommercialFlight(airline, origin, destination, flightNumber, departureTime, numOfPassengers);
			return f;
		}
		else if(type.equals("passenger")) {
			f = new PassengerFlight(airline, origin, destination, flightNumber, departureTime, numOfPassengers);
		}
		else {
			f = null;
		}
		return f;
	}
}
