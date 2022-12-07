/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */

class Animal{

	void eat() {
		System.out.println("every animal eat");
	}
}

class Dog extends Animal{
	
	void eat() {
		System.out.println("Dog eat nonveg");
	}
}

class BabyDog extends Dog{
	
	void eat() {
		System.out.println("baby dog eat only milk");
	}
}


public class RnTMultiLvlPolyMorph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a;
		a=new Animal();
		a.eat();
		a = new Dog();
		a.eat();
		a= new BabyDog();
		a.eat();
	}

}
