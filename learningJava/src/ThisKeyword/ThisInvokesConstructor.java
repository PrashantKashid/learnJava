/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class A{

	A(){
		System.out.println("this is from Constructor A");
	}
	
	A(int x){
		this();
		System.out.println(x);
	}
}


public class ThisInvokesConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A(5);

	}

}
