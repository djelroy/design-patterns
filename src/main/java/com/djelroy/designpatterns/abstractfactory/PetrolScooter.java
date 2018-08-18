package com.djelroy.designpatterns.abstractfactory;

public class PetrolScooter extends Scooter {

	public PetrolScooter(String mode, String countryOrigin) {
		super(mode, countryOrigin);
	}

	@Override
	public String toString() {
		return "PetrolScooter [" + getMode() + ", " + getCountryOrigin() + "]";
	}
}
