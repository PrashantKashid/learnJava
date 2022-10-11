/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class Display{
	
	void m(){
		System.out.println("This is from method M");
	}
	
	void n() {
		m(); //m();//same as this.m()  
		
		/*
		 * You may invoke the method of the current class by using the this keyword. 
		 * If you don't use the this keyword, 
		 * compiler automatically adds this keyword while invoking the method. Let's see the example
		 */
	}
}

public class ThisInvokesMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d1 = new Display();
		d1.n();
	}

}
