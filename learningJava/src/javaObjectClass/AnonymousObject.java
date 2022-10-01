/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
public class AnonymousObject {

	/**
	 * @param args
	 */
	
	void fact(int n) {
		
		int fact = 1;
		
		for(int i= 1; i<=n ; i++) {
			
			fact=fact*i;	
		}
		
		System.out.println(fact);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AnonymousObject().fact(10);
		
	}

}
