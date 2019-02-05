package com.djelroy.designpatterns.facade;

public class TravelFromMontreal {

	private final static String ANGKOR_WAT = "Angkor Wat";
	private final static String MEENAKSHI_TEMPLE = "MEENAKSHI";

	private final Airport airport;
	private final Hotel hotel;
	private final Uber uber;
	private final Activity activity;

	public TravelFromMontreal(Airport airport, Hotel hotel, Uber uber, Activity activity) {
		this.airport = airport;
		this.hotel = hotel;
		this.uber = uber;
		this.activity = activity;
	}

	public void visitAngkorWat() {
		hotel.book();
		uber.bookAndDriveTo("Montreal Airport");
		airport.flyTo("Siem Riep");
		hotel.checkIn();
		activity.rest();
		activity.eat();
		hotel.goOutside();
		
		uber.bookAndDriveTo(ANGKOR_WAT);
		activity.visit(ANGKOR_WAT);
		uber.backToHotel();
		activity.eat();
		activity.rest();
		hotel.checkOut();
		
		uber.bookAndDriveTo("Siem Riep Airport");
		airport.flyTo("Montreal");
	}
	
	public void visitMeenakshi() {
		hotel.book();
		uber.bookAndDriveTo("Montreal Airport");

		airport.flyTo("Madurai");
		hotel.checkIn();
		activity.eat();
		hotel.goOutside();
		
		uber.bookAndDriveTo(MEENAKSHI_TEMPLE);
		activity.visit(MEENAKSHI_TEMPLE);
		
		uber.backToHotel();
		activity.rest();
		hotel.checkOut();
		
		uber.bookAndDriveTo("Madurai Airport");
		airport.flyTo("Montreal");
	}
}
