package com.djelroy.designpatterns.abstractfactory;

//ConcreteFactory 2
public class PetrolVehiculeFactory implements VehiculeFactory {

	public Car createCar(String model, String color) {
		return new PetrolCar(model, color);
	}

	public Scooter createScooter(String mode, String countryOrigin) {
		return new PetrolScooter(mode, countryOrigin);
	}

}
