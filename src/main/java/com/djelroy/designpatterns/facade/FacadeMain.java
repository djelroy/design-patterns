package com.djelroy.designpatterns.facade;

public class FacadeMain {

	public static void main(String[] args) {
		TravelFromMontreal travel = new TravelFromMontreal(new Airport(), new Hotel(), new Uber(), new Activity());

		System.out.println("Let's travel to Cambodia and visit to biggest religious edifice!\n");
		travel.visitAngkorWat();
		
		System.out.println("Wow! The weather is still awful in Montreal. How about another trip?\n");
		travel.visitMeenakshi();
	}

}
