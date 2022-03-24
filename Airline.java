package objectOrientedSoftwareDesignHW;

public class Airline {
	private String airlineName;
	
	public Airline(String name){
		
		if(name.length() > 8) {
			
			try{
				throw new BadParameterException("Airline name is too long");
			}
			catch(BadParameterException e) {
				e.printStackTrace();
			}
		}
		airlineName = name;
	}
	
	public String getName() {
		return airlineName;
	}
}
