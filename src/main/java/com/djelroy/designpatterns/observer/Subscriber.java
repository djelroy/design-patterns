package com.djelroy.designpatterns.observer;

/**
 * This interface represents the Observer of the Observer pattern
 * @author DJ Elroy
 *
 */
public interface Subscriber {

	// basic method 
	void update(Gossip gossip);
	
	String getName();
}
