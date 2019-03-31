package com.djelroy.designpatterns.state;

public class DreamingState extends State {

	public DreamingState(EveryDayLife life) {
		super(life);
	}

	@Override
	public void deepSleep() {
		System.out.println("You are going to completely rest now.");
		life.setCurrentState(life.getDeepSleepState());
	}

	@Override
	public void print() {
		System.out.println("You are dreaming now.");		
	}

	
}
