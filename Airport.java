package objectOrientedSoftwareDesignHW;

public class Airport {
	private String airportName;
	
	public Airport(String name){
		if(name.length() < 3 || name.length() > 3) {
			try{
				throw new BadParameterException("Name needs to be exactly 3 letters long");
			}
			catch(BadParameterException e) {
				e.printStackTrace();
			}
		}
		airportName = name.toUpperCase();
	}
	
	public String getName() {
		return airportName;
	}
}
