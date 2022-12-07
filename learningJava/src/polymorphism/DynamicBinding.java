/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */
class C1{
	void m() {
		System.out.println("Method from C1 class");
	}
}

public class DynamicBinding extends C1{

	/**
	 * @param args
	 */
	void m() {
		System.out.println("Method from DynamicBindingClass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C1 d = new DynamicBinding();
		d.m();
	}

}
