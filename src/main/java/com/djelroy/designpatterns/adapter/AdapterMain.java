package com.djelroy.designpatterns.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		RadioStation radioStation = new RadioStation();
		
		Caller caller = new MontrealCaller();
		caller.speak();
		
		Robot robot = new Robot();
		robot.blabber();
		
		radioStation.receiveCall(caller);
		radioStation.receiveCall(new RobotCaller(robot));
		
		
	}

}
