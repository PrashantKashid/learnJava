/**
 * 
 */
package WhatIsStatic;

/**
 * @author LSPL313
 *
 */
public class StaticVariable {

	/**
	 * @param args
	 */
	
	int roll;
	String sname;
	static String college="Shivray";//Static variable
	/*Suppose there are 500 students in my college, 
	now all instance data members will get memory each time when the object is created. 
	All students have its unique rollno and name, so instance data member is good in such case. 
	Here, "college" refers to the common property of all objects. 
	If we make it static, this field will get the memory only once.
	*/
	
	
	StaticVariable(int r, String n){
		roll=r;
		sname=n;	
	}
	
	
	void displayRecord() {
		System.out.println(roll+" "+sname+" "+college);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable sv = new StaticVariable(11,"Prashant");
		sv.displayRecord();
		StaticVariable sv2 = new StaticVariable(12,"Sachin");
		sv2.displayRecord();
	}
}
