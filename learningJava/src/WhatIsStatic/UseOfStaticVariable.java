/**
 * 
 */
package WhatIsStatic;

/**
 * @author LSPL313
 *
 */

class Counter2{
	
	static int count=0;
	
	Counter2(){
		count++;
	System.out.println(count);
	}
}
	
public class UseOfStaticVariable {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter2 c2 = new Counter2();
		Counter2 c21 = new Counter2();
		Counter2 c22 = new Counter2();
	}

}
