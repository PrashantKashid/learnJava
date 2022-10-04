/**
 * 
 */
package WhatIsStatic;

/**
 * @author LSPL313
 *
 */
public class CalculateByStatMethod {

	/**
	 * @param args
	 */
	
	static int cube(int x) {
		
		return x*x*x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = CalculateByStatMethod.cube(5);
		System.out.println(result);

	}

}
