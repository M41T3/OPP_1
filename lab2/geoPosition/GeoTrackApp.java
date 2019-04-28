package lab2.geoPosition;

import lab1.geoPosition.GeoPosition;

/* Waypoints:
 * 
 * 
 * */

public class GeoTrackApp {

	public static void main(String[] args) {
		
		GeoRoute binnenalster = RouteData.createAlsterRoute1();
		GeoRoute aussenalster = RouteData.createAlsterRoute2();
		
		GeoRoute stadtpark = new GeoRoute("Stadtpark");
		stadtpark.addWaypoint(new GeoPosition(53.598462, 10.004663));
		stadtpark.addWaypoint(new GeoPosition(53.599328, 10.006635));
		stadtpark.addWaypoint(new GeoPosition(53.600253, 10.017334));
		stadtpark.addWaypoint(new GeoPosition(53.60024, 10.029547));
		stadtpark.addWaypoint(new GeoPosition(53.593503, 10.03211));
		stadtpark.addWaypoint(new GeoPosition(53.591077, 10.029318));
		stadtpark.addWaypoint(new GeoPosition(53.591897, 10.01543));
		stadtpark.addWaypoint(new GeoPosition(53.593521, 10.010913));
		stadtpark.addWaypoint(new GeoPosition(53.593222, 10.00786));
		stadtpark.addWaypoint(new GeoPosition(53.592788, 10.003348));
		stadtpark.addWaypoint(new GeoPosition(53.596074, 10.002093));
		stadtpark.addWaypoint(new GeoPosition(53.598462, 10.004663));
		
		System.out.println("Name\t\tDistanz[km]");
		System.out.println(stadtpark.getName() + "\t" + stadtpark.getDistance());
		System.out.println(binnenalster.getName() + "\t" + binnenalster.getDistance());
		System.out.println(aussenalster.getName() + "\t" + aussenalster.getDistance());
		
	}

}
