package io.greencoders.android.guilttrip;

public class Coordinate {

	private double latitude;
	private double longitude;
	
	public Coordinate() {
		latitude = 0;
		longitude = 0;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
