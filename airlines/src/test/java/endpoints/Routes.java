package endpoints;



public class Routes {

	public static String baseURI ="https://api.instantwebtools.net/v1";
	//Airlines
	public static String readAllAirline = baseURI+"/airlines";
	public static String createAirline = baseURI+"/airlines";
	public static String readSpecificAirline = baseURI+"/airlines/{id}";

	//Passenger

	public static String createPassenger = baseURI+"/passenger";
	public static String getSpecificPassenger = baseURI+"/passenger/{id}";
	public static String deleteSpecificPassenger = baseURI+"/passenger/{id}";
	public static String updatePassengerName = baseURI+"/passenger/{id}";
	public static String updatePassengerDetails = baseURI+"/passenger/{id}";


}
