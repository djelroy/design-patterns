package com.djelroy.designpatterns.abstractfactory;

// Product A 
public abstract class Car {

	private final String model;
	private final String color;
	
	protected Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
}
