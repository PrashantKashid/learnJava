/**
 * 
 */
package ThisKeyword;

/**
 * @author LSPL313
 *
 */

	class Student1{
		
		int rollno;
		String name;
		float fee;
		
		Student1(int rollno,String name,float fee){
			this.rollno=rollno;
			this.fee=fee;
			this.name=name;
		}
		
		void display() {
			System.out.println(rollno+","+fee+","+name);
		}
	}

public class ThisReferVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1(10,"Prashant",1000);
		Student1 s2 = new Student1(11,"Sachin",1200);
		s1.display();
		s2.display();
	}

}
