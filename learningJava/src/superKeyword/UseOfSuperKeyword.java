/**
 * 
 */
package superKeyword;

/**
 * @author LSPL313
 *
 */

class Person {

	String fName;
	String lName;

	Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
}

class Employee extends Person {

	int id;
	float salary;

	Employee(int id, String fName, String lName, float salary) {
		super(fName, lName);//reusing parent constructor 
		this.id = id;
		this.salary = salary;
	}

	void display() {
		System.out.println(id + "," + fName + "," + lName + "," + salary);
	}
}

public class UseOfSuperKeyword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(1, "Prashant", "Kashid", 1000000);
		e.display();
	}
}