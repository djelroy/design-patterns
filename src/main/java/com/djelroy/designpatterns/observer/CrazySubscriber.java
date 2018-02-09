package com.djelroy.designpatterns.observer;

public class CrazySubscriber implements Subscriber, Runnable {

	private final String name;
	private GossipBroadcaster broadcaster;
	
	private int receptionNumber = 0;
	private final int max;

	public CrazySubscriber(int max, String name, GossipBroadcaster broadcaster) {
		this.max = max;
		this.name = name;
		this.broadcaster = broadcaster;
	}


	@Override
	public void update(Gossip gossip) {
		receptionNumber++;
		System.out.println(toString() + " has received the following gossip: " + gossip.toString());
	}


	@Override
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "CrazySubscriber [name=" + name + ", max=" + max + "]";
	}


	@Override
	public void run() {
		this.broadcaster.addObserver(this);
		
		while(true) {
			try {
				Thread.sleep(50);
				
				if(receptionNumber == max) {
					broadcaster.deleteObserver(this);
					return;
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
