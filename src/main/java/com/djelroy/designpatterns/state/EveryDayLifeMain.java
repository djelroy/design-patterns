package com.djelroy.designpatterns.state;

public class EveryDayLifeMain {

	public static void main(String[] args) {
		// State objects could be shared among different EverydayLife objects
		EveryDayLife normalLife = new EveryDayLife();
		EveryDayLife yogiLife = new EveryDayLife();
		
		System.out.println("A regular life.");
		normalLife.printCurrentState();
		normalLife.sleep();
		normalLife.printCurrentState();
		normalLife.deepSleep();
		normalLife.printCurrentState();
		normalLife.wakeUp();
		
		System.out.println("\nA yogi's life.");
		yogiLife.printCurrentState();
		yogiLife.meditate();
		yogiLife.printCurrentState();
		yogiLife.wakeUp();
		yogiLife.printCurrentState();
		
		System.out.println("\nAn aspirant yogi's life.");
		yogiLife.printCurrentState();
		yogiLife.sleep();
		yogiLife.stayAware();
		yogiLife.bestowBliss();
		yogiLife.printCurrentState();
	}
}
