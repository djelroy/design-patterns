package com.djelroy.designpatterns.abstractfactory;

public class ElectricScooter extends Scooter {

	public ElectricScooter(String mode, String countryOrigin) {
		super(mode, countryOrigin);
	}

	@Override
	public String toString() {
		return "ElectricScooter [" + getMode() + ", " + getCountryOrigin() + "]";
	}
}
