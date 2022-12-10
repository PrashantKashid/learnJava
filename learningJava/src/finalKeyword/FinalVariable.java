/**
 * 
 */
package finalKeyword;

/**
 * @author LSPL313
 * If you make any variable as final,you cannot change the value of final variable(It will be constant).
 *
 */
public class FinalVariable {

	/**
	 * @param args
	 * There is a final variable speedlimit, we are going to change the value of this variable, 
	 * but It can't be changed because final variable once assigned a value can never be changed.
	 */
	
	final int speedLimit = 100;
	
	void run()
	{
		int speedLimit=200;
		
		System.out.println("speed limit is "+speedLimit);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
