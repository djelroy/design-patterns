package com.djelroy.designpatterns.singleton;

/**
 * This class illustrates how to implement a Singleton using Bill Pugh method
 * @author elroy
 *
 */
public class Environment {

	private static class BillPughSingletonHelper {
		private static final Environment INSTANCE = new Environment();
	}
	
	private Environment() {}
	
	public static Environment getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
}
