package com.djelroy.designpatterns.singleton;

/**
 * This class
 * 
 * @author DJ Elroy
 *
 */
public class SingletonMain {

	public static void main(String[] args) throws SingletonException {
		Environment[] envs = new Environment[5];
		Runtime[] runtimes = new Runtime[5];

		for (int i = 0; i <= 4; i++) {
			envs[i] = Environment.getInstance();
			runtimes[i] = Runtime.getInstance();
		}

		for (int i = 0; i < 4; i++) {
			if (envs[i] != envs[i + 1]) {
				throw new SingletonException();
			}

			if (runtimes[i] != runtimes[i + 1]) {
				throw new SingletonException();
			}
		}
		System.out.println("We just have one instance of Environment and Runtime");

		System.out.println(SingletonEnum.INSTANCE.getClass() + " is definately a Singleton! Just use SingletonEnum.INSTANCE to use it");
	}

	private static class SingletonException extends Exception {

		private static final long serialVersionUID = 1L;

		public SingletonException() {
			super("Not a Singleton instance");

		}
	}

}
