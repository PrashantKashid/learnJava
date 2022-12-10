/**
 * 
 */
package finalKeyword;

/**
 * @author LSPL313
 *
 */
class Vehical{

	final void run() {
		System.out.println("Vehical runs at speed 60");
	};
}

public class FinalMethodLimit extends Vehical{

	/**
	 * @param args
	 *
	 */
	
	//here its giving error after uncomment below method
	/*void run() { 
		System.out.println("vehical run at 100 kmp speed");
	};
	*/
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
