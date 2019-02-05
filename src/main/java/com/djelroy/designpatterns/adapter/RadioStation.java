package com.djelroy.designpatterns.adapter;

public class RadioStation {

	public void receiveCall(Caller c) {
		c.speak();
	}
}
