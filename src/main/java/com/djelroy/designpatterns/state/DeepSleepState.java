package com.djelroy.designpatterns.state;

public class DeepSleepState extends State {

	public DeepSleepState(EverydayLife life) {
		super(life);
	}	
	
	@Override
	public void sleep() {
		System.out.println("You are already in deep sleep.");
	}

	@Override
	public void deepSleep() {
		System.out.println("You are already in deep sleep.");
	}

	@Override
	public void meditate() {
		System.out.println("It is impossible to meditate in deep sleep.");
	}

	@Override
	public void bestowBliss() {
		System.out.println("You already are blissful.");
	}

	@Override
	public void print() {
		System.out.println("You are now in deep sleep.");
	}
}
