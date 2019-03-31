package com.djelroy.designpatterns.state;

public abstract class State {

	protected final EveryDayLife life;
	
	public State(EveryDayLife life) {
		this.life = life;
	}

	public void wakeUp() {
		System.out.println("You are waking up.");
		life.setCurrentState(life.getWakingState());
	}
	public void sleep() {
		System.out.println("You must be awake to fall asleep.");
	};
	
	public void deepSleep() {
		System.out.println("You must be dreaming to deep sleep.");		
	}
	
	public void meditate() {
		System.out.println("You are meditating.");
		life.setCurrentState(life.getSamadhi());
	};
	
	public void stayAware() {
		System.out.println("Your awareness get a hold on turya");
		life.setCurrentState(life.getTuryaGapState());
	}
	
	public void bestowBliss() {
		System.out.println("You have to be in the supreme state of turya!");
	}	
	
	public abstract void print();
}
