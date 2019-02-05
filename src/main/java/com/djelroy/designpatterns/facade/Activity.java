package com.djelroy.designpatterns.facade;

public class Activity {

	public void visit(String place) {
		System.out.println("We are visiting " + place);
	}
	
	public void rest() {
		System.out.println("We are resting");
	}
	
	public void eat() {
		System.out.println("We are eating");
	}
}
