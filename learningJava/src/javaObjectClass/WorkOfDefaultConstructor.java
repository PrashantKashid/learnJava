/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
public class WorkOfDefaultConstructor {

	/**
	 * @param args
	 */
	
//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.	
	
	
	int a;
	String s;
	
	void display() {
		System.out.println(a+" "+s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WorkOfDefaultConstructor wdc = new WorkOfDefaultConstructor();
		wdc.display();
		WorkOfDefaultConstructor wdc1 = new WorkOfDefaultConstructor();
		wdc1.display();
	}

}
