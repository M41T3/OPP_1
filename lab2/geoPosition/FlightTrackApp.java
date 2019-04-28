package lab2.geoPosition;

import java.util.ArrayList;

public class FlightTrackApp {

	public static void main(String[] args) {
		
		ArrayList<GeoRoute> flightRoutes = new ArrayList<GeoRoute>();
		
		flightRoutes = RouteData.createFlightRoutes();
		
		// Bubblesort:
		
		for(GeoRoute r : flightRoutes) {
			
			System.out.println(r.getName() + ": " + r.getDistance());
			// Hier sortieren und ausgeben
		}
		
	}

}
