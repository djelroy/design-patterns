package com.djelroy.designpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

// Client
public class ClientMain {

	public static void main(String[] args) {

		VehiculeFactory vehiculeFactory;
		List<Scooter> scooters = new ArrayList<>();
		List<Car> cars = new ArrayList<>();
		
		String type = args[0];
		
		if(type != null && type.equals("electric")) {
			vehiculeFactory = new ElectricVehiculeFactory();
		}
		
		else if(type != null && type.equals("petrol")) {
			vehiculeFactory = new PetrolVehiculeFactory();
		}
		else {
			System.out.println("Type should be provided: electric or petrol");
			return;
		}
		
		cars.add(vehiculeFactory.createCar("Fiat", "Black"));
		cars.add(vehiculeFactory.createCar("Ferrari", "Red"));
		cars.add(vehiculeFactory.createCar("Mustang", "Yellow"));

		scooters.add(vehiculeFactory.createScooter("Jaguar", "France"));
		scooters.add(vehiculeFactory.createScooter("Thunder", "UK"));
		scooters.add(vehiculeFactory.createScooter("Supreme Rider", "US"));
		
		cars.forEach(System.out::println);
		scooters.forEach(System.out::println);

	}

}
