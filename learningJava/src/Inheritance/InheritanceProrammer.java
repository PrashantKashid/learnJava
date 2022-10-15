/**
 * 
 */
package Inheritance;

/**
 * @author LSPL313
 *
 */
class Employee{
	
	float salary = 50000;
}


public class InheritanceProrammer extends Employee {

	/**
	 * @param args
	 */
	//This is Student class
	
	float bonus = 1000;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceProrammer ip = new InheritanceProrammer();
		System.out.println(ip.bonus);
		System.out.println(ip.salary);//Due to inheritance subclass can access data of Superclass

	}

}
