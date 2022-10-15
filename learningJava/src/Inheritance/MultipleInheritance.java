/**
 * 
 */
package Inheritance;

/**
 * @author LSPL313
 *
 */


class A1{
	int a=10;
	
	void display() {
		System.out.println("this is called from class a1");
	}
}

class A2{
	int a=20;
	void display() {
		System.out.println("this is called from class a2");
	}
}

class A3 extends A2//, A1
{
	}

public class MultipleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A3 d = new A3();
		d.display();

	}

}
