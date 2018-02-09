package com.djelroy.designpatterns.observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		ArtistGossiper gossipBroadcaster = new ArtistGossiper();
		gossipBroadcaster.start();
		
		new Thread(new CrazySubscriber(1, "DJ Elroy", gossipBroadcaster)).start();
		new Thread(new CrazySubscriber(2, "Steven Tyler", gossipBroadcaster)).start();;
		new Thread(new CrazySubscriber(4, "Junior", gossipBroadcaster)).start();;
		
	}

}
