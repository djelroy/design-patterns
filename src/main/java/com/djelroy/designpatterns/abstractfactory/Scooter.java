package com.djelroy.designpatterns.abstractfactory;

// Product B
public abstract class Scooter {

	private final String mode;
	private final String countryOrigin;
	
	protected Scooter(String mode, String countryOrigin) {
		this.mode = mode;
		this.countryOrigin = countryOrigin;
	}

	public String getMode() {
		return mode;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}
}
