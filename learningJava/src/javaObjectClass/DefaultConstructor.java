/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
public class DefaultConstructor {

	/**
	 * @param args
	 */

//Rule: If there is no constructor in a class, compiler automatically creates a default constructor.	
//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
	DefaultConstructor(){
		System.out.println("Bike created"); //
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstructor dc =new DefaultConstructor();
//It will be invoked at the time of object creation thats why it executing sysout from constructor

	}

}
