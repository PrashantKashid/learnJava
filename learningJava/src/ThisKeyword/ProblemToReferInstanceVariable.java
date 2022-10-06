/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

	class Student{
		
		int rollno;
		String name;
		float fee;
		
		Student(int rollno, String name, float fee){
			rollno=rollno;
			name=name;
			fee=fee;
		}
	
		void display() {
			System.out.println(rollno+","+name+","+fee);
		}		
}

public class ProblemToReferInstanceVariable {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(1,"Prashant", 1000);
		Student s1 = new Student(2,"Sachin",2000);
		s.display();
		s1.display();
	}
	
	/*
	 * In the above example, parameters (formal arguments) and instance variables are same. 
	 * So, we are using this keyword to distinguish local variable and instance variable.
	 */

}
