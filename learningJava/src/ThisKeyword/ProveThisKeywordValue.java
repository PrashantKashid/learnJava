/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class A5{

	void m() {
		System.out.println(this);//prints the reference ID
	}
}

public class ProveThisKeywordValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A5 a = new A5();
		System.out.println(a);//prints the reference ID
		a.m();
	}

}
