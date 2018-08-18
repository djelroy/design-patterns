package com.djelroy.designpatterns.abstractfactory;

public class PetrolCar extends Car {

	protected PetrolCar(String model, String color) {
		super(model, color);
	}

	@Override
	public String toString() {
		return "PetrolCar [" + getModel() + ", " + getColor() + "]";
	}
}
