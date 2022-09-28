/**
 * 
 */
package coreJava;

/**
 * @author LSPL313
 *
 */
public class ContinueWithLable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		aa:
		for(int i=1; i<=5; i++) {
			bb:
				for(int j=1; j<=5; j++) {
					
					if(i==j) {
						continue aa;
					}
					System.out.println(i+" "+j);
				}
		}

	}

}
