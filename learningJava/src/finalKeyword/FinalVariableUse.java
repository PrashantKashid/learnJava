/**
 * 
 */
package finalKeyword;

/**
 * @author LSPL313
 *
 */

public class FinalVariableUse {

	/**
	 * @param args
	 */
	
	final int speed;
	
	FinalVariableUse(){
		speed = 70;
	}
	
	void checkSpeed()
	{
		System.out.println("speed is "+speed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalVariableUse f = new FinalVariableUse();
		f.checkSpeed();

	}

}
