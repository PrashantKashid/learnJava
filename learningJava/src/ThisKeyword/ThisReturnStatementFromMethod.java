/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class Y{
	
	//get method which return this as statement
	
	Y getY() {
		return this;
	}
	
	void display() {
		System.out.println("Hello");
	}
	
}


public class ThisReturnStatementFromMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Y().getY().display();// here as get method return the object we call display method directly on it.
	}

}
