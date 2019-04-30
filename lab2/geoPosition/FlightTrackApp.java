package lab2.geoPosition;

import java.util.ArrayList;
import java.util.Collections;

public class FlightTrackApp {

	public static void main(String[] args) {
		
		ArrayList<GeoRoute> flightRoutes = new ArrayList<GeoRoute>();
		
		flightRoutes = RouteData.createFlightRoutes();
		
		
		Collections.sort(flightRoutes);
		
		for(GeoRoute r : flightRoutes) {
			
			System.out.println(r.getName() + ": " + r.getDistance());
			
		}
		
	}

}
