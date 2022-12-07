/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */
class Animals{
 void speak() {
	 System.out.println("every animal speak");
 }
	
}

class Dogs extends Animals{
	void speak() {
		System.out.println("Dog barks");
	}
	
}

class BabyDogs extends Dogs{
	
	//here we have not define any method , so its calling parents method
	
}

public class RnTmPlyChildClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a;
		a = new BabyDogs();
		a.speak();//here we have not define any method in BabyDog class, so its calling parents method
		//Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.
	}
}
