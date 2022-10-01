/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
public class ConstructorOverloading {

	/**
	 * @param args
	 */
	
	int roll;
	String name;
	int age;
	
	ConstructorOverloading(int r, String n){
		roll = r;
		name=n;		
	}
	
	ConstructorOverloading(){
		
	}
	
	ConstructorOverloading(int r, String n, int a){
		roll = r;
		name=n;	
		age=a;
		
	}
	
	void display() {
		System.out.println(roll+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading defaultConst = new ConstructorOverloading();
		defaultConst.display();
		ConstructorOverloading customConst1 = new ConstructorOverloading(5,"Prashant");
		customConst1.display();
		ConstructorOverloading customConst2 = new ConstructorOverloading(10,"Prash",15);
		customConst2.display();
		
		
		
		
	}

}
