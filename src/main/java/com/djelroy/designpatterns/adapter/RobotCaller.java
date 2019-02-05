package com.djelroy.designpatterns.adapter;

public class RobotCaller implements Caller {
	
	private final Robot robot;

	public RobotCaller(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void speak() {
		robot.blabber();
	}
}
