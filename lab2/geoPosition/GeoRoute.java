package lab2.geoPosition;
import java.text.DecimalFormat;
import java.util.ArrayList;
import lab1.geoPosition.GeoPosition;

public class GeoRoute implements Distance, Comparable<GeoRoute>{
	
	private String name;
	private ArrayList<GeoPosition> waypoints;
	
	public GeoRoute(String name) {
		this.name = name;	
		this.waypoints = new ArrayList<GeoPosition>();
	}
		
	public GeoRoute(String name, ArrayList<GeoPosition> waypoints) {
		this(name);
		this.waypoints = waypoints;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addWaypoint(GeoPosition newWaypoint) {
		this.waypoints.add(newWaypoint);
	}
	
	public void removeWaypoint(int index) {
		this.waypoints.remove(index);
	}
	
	public int getNumberWaypoints() {
		return this.waypoints.size();	
	}
	
	public GeoPosition getWaypoint(int index) {
		return this.waypoints.get(index);
	}
	
	public GeoPosition[] getWaypoints() {
		return (GeoPosition[]) this.waypoints.toArray();	//??(GeoPosition[])
	}
	
	public double getDistance() {
		int n = getNumberWaypoints();
		double sum = 0;
		
		for(int i = 0; i < (n-1); i++) {
			sum += GeoPosition.distanceInKm(this.getWaypoint(i), this.getWaypoint(i+1));
		}
		
		return sum;
	}
	
	public int compareTo(GeoRoute other) {
		if (this.getDistance() < other.getDistance()) 
			return -1;
		else if(this.getDistance() > other.getDistance())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		DecimalFormat f = new DecimalFormat("#0.0");
		return this.name + " (" + f.format(this.getDistance()) + " km)";
	}
	
	
}
