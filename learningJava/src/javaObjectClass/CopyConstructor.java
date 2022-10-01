/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */
public class CopyConstructor {

	/**
	 * @param args
	 */
	
	int roll;
	String name;
	
	CopyConstructor(int r, String n){
		roll=r;
		name=n;
		
	}
	
	CopyConstructor(CopyConstructor cs){
		roll = cs.roll;
		name=cs.name;
	}
	
	void display() {
		System.out.println(roll+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructor cc1 = new CopyConstructor(2,"Sachin");
		cc1.display();
		CopyConstructor cc2 = new CopyConstructor(cc1);
		cc2.display();	

	}

}
