/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

class X{
	
	ThisAsArgumentInConstructor tc;
	
	
	X(ThisAsArgumentInConstructor tc){
		this.tc=tc;
	}
	
	void display() {
		System.out.println(tc.data);
	}
}



public class ThisAsArgumentInConstructor {

	/**
	 * @param args
	 */
	int data =100;
	ThisAsArgumentInConstructor(){
		X x = new X(this);
		x.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisAsArgumentInConstructor tc1 = new ThisAsArgumentInConstructor();
		
	}

}
