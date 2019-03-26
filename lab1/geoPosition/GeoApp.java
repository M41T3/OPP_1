package lab1.geoPosition;

public class GeoApp {

	
	public static void main(String[] args) {
		
		GeoPosition haw_hamburg = new GeoPosition(Locations.HAW_LAT, Locations.HAW_LON);
		GeoPosition eiffel = new GeoPosition(Locations.EIFFEL_LAT, Locations.EIFFEL_LON);
		GeoPosition palma = new GeoPosition(Locations.PALMA_LAT, Locations.PALMA_LON);
		GeoPosition vegas = new GeoPosition(Locations.VEGAS_LAT, Locations.VEGAS_LON);
		GeoPosition copa = new GeoPosition(Locations.COPA_LAT, Locations.COPA_LON);
		GeoPosition waikiki = new GeoPosition(Locations.WAIKIKI_LAT, Locations.WAIKIKI_LON);
		GeoPosition surf = new GeoPosition(Locations.SURF_LAT, Locations.SURF_LON);
		
		GeoPosition npole = new GeoPosition(Locations.NPOLE_LAT, Locations.HAW_LON);
		GeoPosition equator = new GeoPosition(Locations.EQUATOR_LAT, Locations.HAW_LON);
		GeoPosition spole = new GeoPosition(Locations.SPOLE_LAT, Locations.HAW_LON);
		
		System.out.println("Eiffelturm " + eiffel.getLatitude() + " " +
				eiffel.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, eiffel) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, eiffel) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, eiffel) / GeoPosition.distanceInKm(haw_hamburg, eiffel)
				* 100 + "%");
		
		System.out.println("Palma de Mallorca " + palma.getLatitude() + " " +
				palma.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, palma) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, palma) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, palma) / GeoPosition.distanceInKm(haw_hamburg, palma)
				* 100 + "%");
		
		System.out.println("Las Vegas " + vegas.getLatitude() + " " +
				vegas.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, vegas) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, vegas) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, vegas) / GeoPosition.distanceInKm(haw_hamburg, vegas)
				* 100 + "%");
		
		System.out.println("Copacabana " + copa.getLatitude() + " " +
				copa.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, copa) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, copa) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, copa) / GeoPosition.distanceInKm(haw_hamburg, copa)
				* 100 + "%");
		
		System.out.println("Waikiki Beach " + waikiki.getLatitude() + " " +
				waikiki.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, waikiki) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, waikiki) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, waikiki) / GeoPosition.distanceInKm(haw_hamburg, waikiki)
				* 100 + "%");
		
		System.out.println("Surfer's Paradise " + surf.getLatitude() + " " +
				surf.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, surf) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, surf) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, surf) / GeoPosition.distanceInKm(haw_hamburg, surf)
				* 100 + "%");
		
		System.out.println("\n\n");
		
		System.out.println("Nordpol " + npole.getLatitude() + " " +
				haw_hamburg.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, npole) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, npole) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, npole) / GeoPosition.distanceInKm(haw_hamburg, npole)
				* 100 + "%");
		
		System.out.println("Äquator " + equator.getLatitude() + " " +
				haw_hamburg.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, equator) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, equator) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, equator) / GeoPosition.distanceInKm(haw_hamburg, equator)
				* 100 + "%");
		
		System.out.println("Südpol " + spole.getLatitude() + " " +
				haw_hamburg.getLongitude() + " " + GeoPosition.distanceInKm(haw_hamburg, spole) + " "
				+ GeoPosition.localDistanceInKm(haw_hamburg, spole) + 
				" " + GeoPosition.localDistanceInKm(haw_hamburg, spole) / GeoPosition.distanceInKm(haw_hamburg, spole)
				* 100 + "%");
		
	}

}
