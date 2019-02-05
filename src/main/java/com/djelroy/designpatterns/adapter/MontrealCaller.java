package com.djelroy.designpatterns.adapter;

public class MontrealCaller implements Caller {

	@Override
	public void speak() {
		System.out.println("Hi! I'm calling from Montreal. How are you?");
	}

}
