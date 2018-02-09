package com.djelroy.designpatterns.observer;

/**
 * This interface represents the Subject of the Observer pattern
 * @author DJ Elroy
 *
 */
public interface GossipBroadcaster {
	// basic methods of the Observer pattern
	void addObserver(Subscriber subscriber);
	void deleteObserver(Subscriber subscriber);
	void notifyObservers();
}
