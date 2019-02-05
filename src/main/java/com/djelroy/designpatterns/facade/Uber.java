package com.djelroy.designpatterns.facade;

public class Uber {

	public void bookAndDriveTo(String place) {
		System.out.println("Our Uber ride has just arrived!");
		System.out.println("We're now going to " + place);
		System.out.println("...");
		System.out.println("We have just arrived to " + place);
	}
	
	public void backToHotel() {
		System.out.println("We're now going back to our hotel");
		System.out.println("...");
		System.out.println("We have just arrived back to our hotel");
	}
}
