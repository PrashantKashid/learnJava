/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class Ab{
	
	void m(Ab a) {
		System.out.println("Method invoke");
	}
	
	void p() {
		m(this);
	}	
}
public class ThisArgumentToMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ab a = new Ab();
		a.p();

	}

}
