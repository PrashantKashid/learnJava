/**
 * 
 */
package InstanceInitializerBlock;

/**
 * @author LSPL313
 *
 */
public class Example1 {

	int speed=10;
	
	void bikeRun(){
		System.out.println("bike run at speed "+speed);
	}
	
	{speed=100;}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 e1 = new Example1();
		e1.bikeRun();
	}
	
	

}
