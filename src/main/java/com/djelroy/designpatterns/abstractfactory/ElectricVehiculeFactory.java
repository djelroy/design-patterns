package com.djelroy.designpatterns.abstractfactory;

// ConcreteFactory 1
public class ElectricVehiculeFactory implements VehiculeFactory {

	private static class BillPughSingletonHelper {
		private final static ElectricVehiculeFactory INSTANCE = new ElectricVehiculeFactory();
	}

	private ElectricVehiculeFactory() {}
	
	public static ElectricVehiculeFactory getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
	
	public Car createCar(String model, String color) {
		return new ElectricCar(model, color);
	}

	public Scooter createScooter(String mode, String countryOrigin) {
		return new ElectricScooter(mode, countryOrigin);
	}

}
