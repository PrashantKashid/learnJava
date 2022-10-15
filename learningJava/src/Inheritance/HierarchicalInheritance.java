/**
 * 
 */
package Inheritance;

/**
 * @author LSPL313
 *
 */

class Human{
	
	void are() {
		System.out.println("Human are live");
	}	
}

class Engineer extends Human{
	
	void work() {
		System.out.println("Engineers are Humans");
	}
}

class SoftwareEng extends Human{
	
	void developemt() {
		System.out.println("Software eng do development of software");
	}
}

public class HierarchicalInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoftwareEng se =new SoftwareEng();
		se.are();
		se.developemt();	
	}

}
