package com.djelroy.designpatterns.observer;

/**
 * Simple POJO to pass to the subscribers
 * @author DJ Elroy
 *
 */
public class Gossip {

	private final String title;
	private final String description;
	
	public Gossip(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Gossip [title=" + title + "]";
	}
}
