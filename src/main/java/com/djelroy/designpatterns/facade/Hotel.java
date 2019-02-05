package com.djelroy.designpatterns.facade;

public class Hotel {

	public void book() {
		System.out.println("A room has been successfully booked!");
	}
	
	public void checkIn() {
		System.out.println("Check-in at the hotel");
	}
	
	public void checkOut() {
		System.out.println("Check-out at the hotel");
	}
	
	public void goOutside() {
		System.out.println("Let's go visit!");
	}
}
