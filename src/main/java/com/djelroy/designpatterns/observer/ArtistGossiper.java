package com.djelroy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ArtistGossiper extends Thread implements GossipBroadcaster {

	private final List<Subscriber> subscribers = new ArrayList<>();
	private Gossip latestGossip;

	@Override
	public void addObserver(Subscriber subscriber) {
		synchronized (subscribers) {
			System.out.println("Adding subscriber: " + subscriber.toString());
			subscribers.add(subscriber);
		}

	}

	@Override
	public void deleteObserver(Subscriber subscriber) {
		synchronized (subscribers) {
			System.out.println("\nRemoving subscriber: " + subscriber.toString());
			subscribers.remove(subscriber);
		}
	}

	@Override
	public void notifyObservers() {
		System.out.println("Broadcasting " + latestGossip.toString());
		subscribers.forEach(s -> s.update(latestGossip));
	}

	private void addGossip(Gossip gossip) {
		this.latestGossip = gossip;
		System.out.println("\nAdded gossip = " + gossip.toString());
		notifyObservers();
	}

	@Override
	public void run() {

		try {
			while (subscribers.size() == 0) {
				Thread.sleep(2000);
			}

			addGossip(new Gossip("Aerosmith Scandal", "Aerosmith didn't show up in their last concert!"));

			Thread.sleep(1000);

			addGossip(new Gossip("DJ Elroy High!", "DJ Elroy spotted dancing ecstatically!"));
			Thread.sleep(1000);
			
			addGossip(new Gossip("ArtistGossiper on Trial?",
					"Crazy subscribers filed a lawsuit against the giant gossip broadcaster"));
			Thread.sleep(1000);
			
			addGossip(new Gossip("Biggest Lie Ever", "DJ Elroy is still alive"));

			Thread.sleep(3000);

			addGossip(new Gossip("DJ Elroy Leaked Songs", "DJ Elroy leaked himself his forthcoming album!"));

			while (subscribers.size() != 0) {
				Thread.sleep(3000);
			}

			addGossip(new Gossip("This gossip will not be received by subscribers even when broadcasted",
					"ArtistGossiper members all in prison!"));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
