/**
 * 
 */
package Inheritance;

/**
 * @author LSPL313
 *
 */

class Animal{
	
	void eat() {
		System.out.println("Animal eats");
	}
}
class Dog extends Animal{
	
	void bark() {
		System.out.println("Dog Bark");
	}
}

public class SingleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
