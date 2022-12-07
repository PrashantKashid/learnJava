/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */

class Bike{
	
	void run() {
		System.out.println("running");
	}
}

class Splender extends Bike{
	
	void run() {
		System.out.println("Splender running");
	}
}

public class RuntimePolymorphismUpcasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Splender();
		b.run();
		
	}

}
