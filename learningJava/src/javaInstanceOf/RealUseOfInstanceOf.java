/**
 * 
 */
package javaInstanceOf;

/**
 * @author LSPL313
 *
 */

interface Printable {
}

class A implements Printable {

	void a() {
		System.out.println("Method of A");
	}
}

class B implements Printable {

	void b() {
		System.out.println("Method from B");
	}
}

class C {

	void invoke(Printable p) {
		if (p instanceof A) {
			A a1 = (A) p;
			a1.a();
		}
		if (p instanceof B) {
			B b1 = (B) p;
			b1.b();
		}
	}

}

public class RealUseOfInstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p1 = new A();
		C c1 = new C();
		c1.invoke(p1);

		Printable p2 = new B();
		C c2 = new C();
		c1.invoke(p2);

	}

}
