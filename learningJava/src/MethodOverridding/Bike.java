/**
 * 
 */
package MethodOverridding;

/**
 * @author LSPL313
 *
 */

class Vehical {
	
	void run() {
		System.out.println("Vehical runs");
	}
}

public class Bike extends Vehical{

	/**
	 * @param args
	 */	

	void run() {
		System.out.println("Bike run on 2 wheels");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Bike();
		b.run();

	}

}
