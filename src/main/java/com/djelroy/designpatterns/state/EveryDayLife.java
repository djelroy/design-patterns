package com.djelroy.designpatterns.state;

public class EveryDayLife {

	private final State wakingState;
	private final State dreamingState;
	private final State deepSleepState;
	private final State samadhi;
	private final State turyaGapState;
	
	private State currentState;
	
	public EveryDayLife() {
		this.wakingState = new WakingState(this);
		this.dreamingState = new DreamingState(this);
		this.deepSleepState = new DeepSleepState(this);
		this.samadhi = new SamadhiState(this);
		this.turyaGapState = new TuryaGapState(this);
		
		this.currentState = wakingState;
	}

	public void wakeUp() {
		currentState.wakeUp();
	}

	public void sleep() {
		currentState.sleep();
	}

	public void deepSleep() {
		currentState.deepSleep();
	}

	public void meditate() {
		currentState.meditate();
	}

	public void printCurrentState() {
		currentState.print();
	}
	public void stayAware() {
		currentState.stayAware();
	}

	public void bestowBliss() {
		currentState.bestowBliss();
	}

	public State getWakingState() {
		return wakingState;
	}

	public State getDreamingState() {
		return dreamingState;
	}

	public State getDeepSleepState() {
		return deepSleepState;
	}

	public State getSamadhi() {
		return samadhi;
	}

	public State getTuryaGapState() {
		return turyaGapState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
}
