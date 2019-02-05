package com.djelroy.designpatterns.facade;

public class Airport {

	public void flyTo(String city) {
		System.out.println("Welcome aboard ladies and gentlemen!");
		System.out.println("We are taking off now for " + city);
		System.out.println("After this wonderful trip, we are now landing!");
		System.out.println("We have just landed! We wish you a very nice holiday!");
	}
}
