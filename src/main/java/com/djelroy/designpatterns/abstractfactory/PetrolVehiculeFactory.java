package com.djelroy.designpatterns.abstractfactory;

//ConcreteFactory 2
public class PetrolVehiculeFactory implements VehiculeFactory {

	private static class BillPughSingletonHelper {
		private final static PetrolVehiculeFactory INSTANCE = new PetrolVehiculeFactory();
	}
	
	private PetrolVehiculeFactory() {}
	
	public static PetrolVehiculeFactory getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
	
	public Car createCar(String model, String color) {
		return new PetrolCar(model, color);
	}

	public Scooter createScooter(String mode, String countryOrigin) {
		return new PetrolScooter(mode, countryOrigin);
	}

}
