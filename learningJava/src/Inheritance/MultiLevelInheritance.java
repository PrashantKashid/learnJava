/**
 * 
 */
package Inheritance;

/**
 * @author LSPL313
 *
 */

class Animals{
	
	void eat() {
		System.out.println("Animal eats");
	}	
}

class Dogs extends Animals{
	void bark() {
		System.out.println("Dog barking");
	}
}

class BabyDog extends Dogs{
	
	void weep() {
		System.out.println("Baby Dog Weeping");
	}
}

public class MultiLevelInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}

}
