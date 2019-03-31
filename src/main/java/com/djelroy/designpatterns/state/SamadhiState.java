package com.djelroy.designpatterns.state;

public class SamadhiState extends State {

	public SamadhiState(EverydayLife life) {
		super(life);
	}

	@Override
	public void sleep() {
		System.out.println("You can only wake up from samadhi.");
	}

	@Override
	public void deepSleep() {
		System.out.println("You can only wake up from samadhi.");
	}

	@Override
	public void meditate() {
		System.out.println("Why meditate when you are blissful?");
	}

	@Override
	public void stayAware() {
		System.out.println("You are already totally aware.");
	}

	@Override
	public void bestowBliss() {
		System.out.println("You already are blissful.");
	}

	@Override
	public void print() {
		System.out.println("You are in samadhi now.");
	}

}
