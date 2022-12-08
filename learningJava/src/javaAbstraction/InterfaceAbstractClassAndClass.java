/**
 * 
 */
package javaAbstraction;

/**
 * @author LSPL313
 *
 */
interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A {

	public void c() {
		System.out.println(" i am C");
	}

}

class Z extends B {

	public void a() {
		System.out.println("i am A");

	}

	public void b() {
		System.out.println("i am B");

	}

	public void d() {
		System.out.println("i am D");

	}
}

public class InterfaceAbstractClassAndClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
