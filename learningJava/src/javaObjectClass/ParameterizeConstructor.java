/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
public class ParameterizeConstructor {

	/**
	 * @param args
	 */
	
	int roll;
	String name;
	
	ParameterizeConstructor(int r, String n){
		
		roll =r;
		name=n;	
		
	}
	
	void display() {
		System.out.println(roll+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizeConstructor pc = new ParameterizeConstructor(1,"Prashant");
		pc.display();

		ParameterizeConstructor pc1 = new ParameterizeConstructor(2,"Shant");
		pc1.display();
		

	}

}
