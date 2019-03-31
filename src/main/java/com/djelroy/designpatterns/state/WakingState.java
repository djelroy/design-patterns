package com.djelroy.designpatterns.state;

public class WakingState extends State {

	public WakingState(EverydayLife life) {
		super(life);
	}

	@Override
	public void wakeUp() {
		System.out.println("You are already awake!");
	}

	@Override
	public void sleep() {
		System.out.println("You are falling asleep.");
		life.setCurrentState(life.getDreamingState());
	}

	@Override
	public void print() {
		System.out.println("You are fully awake now.");
	}
}
