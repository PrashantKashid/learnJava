/**
 * 
 */
package WhatIsStatic;

/**
 * @author LSPL313
 *
 */
public class StaticBlockExample {

	/**
	 * @param args
	 */
	
	
	/*
	 * Is used to initialize the static data member.
	 * It is executed before the main method at the time of classloading.
	 */
	
	static {
		System.out.println("Static block invoked before main method get call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Main");

	}

}
