/**
 * 
 */
package javaInstanceOf;

/**
 * @author LSPL313
 *
 */

class Animal{
	
}

class Dog extends Animal{
	
	 static void method(Animal a) {
		if(a instanceof Dog) {
			Dog d = (Dog)a;
			System.out.println("Animal typecasted to Dog");
		}
	}
	
}

public class DowncastingWithInstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Dog();
		Dog.method(a1);

	}

}
