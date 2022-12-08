/**
 * 
 */
package javaAbstraction;

/**
 * @author LSPL313
 *
 */

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike {

	Bike() {
		System.out.println("Bike created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("Gear changed");
	}

}
//Creating a Child class which inherits Abstract class  
class Hero extends Bike
{
	void run() {
		System.out.println("Bike running");		
	}
}
//Creating a Test class which calls abstract and non-abstract methods 

public class TestAbstraction2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Hero();
		b.run();
		b.changeGear();
	}

}
