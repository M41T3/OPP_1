package lab1.geoPosition;

public class GeoPosition {
	
	private double latitude;
	private double longitude;
	
	public GeoPosition(double latitude, double longitude) { // Constructor
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	public boolean isNorthernHemisphere() {
		return this.latitude > 0 ? true :  false; 
	}
	
	public boolean isSouthernHemisphere() {
		return this.latitude < 0 ? true :  false; 
	}
	
	public static double localDistanceInKm(GeoPosition a, GeoPosition b) {
		double dy = 111.3 * Math.abs(a.latitude - b.latitude);
		double dx = 111.3 * Math.cos((a.latitude + b.latitude)/2) * Math.abs(a.longitude - b.longitude);
		
		return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
	}
	
	public static double distanceInKm(GeoPosition a, GeoPosition b) {
		
		return 6378.388 * Math.acos(Math.sin(a.latitude) * Math.sin(b.latitude + Math.cos(a.latitude) * Math.cos(b.latitude) * Math.cos(b.longitude - a.longitude)));
	}

	public double distanceInKm(GeoPosition other) {
		
		return 6378.388 * Math.acos(Math.sin(this.latitude) * Math.sin(other.latitude + Math.cos(this.latitude) * Math.cos(other.latitude) * Math.cos(other.longitude - this.longitude)));
	}

	@Override
	public String toString() {
		return "(" + latitude + ", " + longitude + ")";
	}
	
	
}