/**
 * 
 */
package coreJava;

/**
 * @author LSPL313
 *
 */
public class ContinueDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		do{
			
			if(i==7) {
				i++;
				continue;
			}
			System.out.println(i);
			//
			i++;
		}while(i<=10);

	}

}
