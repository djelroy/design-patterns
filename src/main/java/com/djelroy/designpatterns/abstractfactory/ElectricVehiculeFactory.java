package com.djelroy.designpatterns.abstractfactory;

// ConcreteFactory 1
public class ElectricVehiculeFactory implements VehiculeFactory {

	public Car createCar(String model, String color) {
		return new ElectricCar(model, color);
	}

	public Scooter createScooter(String mode, String countryOrigin) {
		return new ElectricScooter(mode, countryOrigin);
	}

}
