package com.djelroy.designpatterns.abstractfactory;

// Abstract Factory
public interface VehiculeFactory {

	Car createCar(String model, String color);
	Scooter createScooter(String mode, String countryOrigin);
}
