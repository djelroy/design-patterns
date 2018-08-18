package com.djelroy.designpatterns.abstractfactory;

/**
 * @author sahajiya
 *
 */
public class ElectricCar extends Car {

	public ElectricCar(String model, String color) {
		super(model, color);
	}

	@Override
	public String toString() {
		return "ElectricCar [" + getModel() + ", " + getColor() + "]";
	}
}
