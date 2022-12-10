/**
 * 
 */
package finalKeyword;

/**
 * @author LSPL313
 *
 */

 class Bike {
		//final method is inherited but you cannot override it. For Example
	 final void run() {
			System.out.println("running");
		}
}

public class FinalMethodUse extends Bike {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethodUse f = new FinalMethodUse();
		f.run();
	}
}
