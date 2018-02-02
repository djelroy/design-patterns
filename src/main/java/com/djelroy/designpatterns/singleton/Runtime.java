package com.djelroy.designpatterns.singleton;

/**
 *  This class illustrates how to implement a Singleton using a synchronised block
 * @author DJ Elroy
 *
 */
public class Runtime {

	private static volatile Runtime instance = null;

	private Runtime() {
	}

	public static Runtime getInstance() {

		if (instance == null) {
			synchronized (Runtime.class) {
				if (instance == null) {
					instance = new Runtime();
				}
			}
		}

		return instance;
	}
}
