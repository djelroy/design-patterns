package com.djelroy.designpatterns.state;

public class TuryaGapState extends State {

	public TuryaGapState(EverydayLife life) {
		super(life);		
	}

	@Override
	public void bestowBliss() {
		System.out.println("The blissful state of turya will establish you in samadhi!");
		life.setCurrentState(life.getSamadhi());
	}

	@Override
	public void print() {
		System.out.println("You are fully awake now.");
	}
}

