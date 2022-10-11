/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class B{
	B(){
		
	this(5);//Calling parameterized constructor from default constructor:
	System.out.println("This is from Default constructor(non parametorized)");
	}

	/**
	 * @param i
	 */
	 B(int i) {
		// TODO Auto-generated constructor stub
		 System.out.println("This is from paramerterized");
		 System.out.println(i);
	}
	
}

public class ThisParameterizedConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();

	}

}
