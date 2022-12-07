/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */

class Shape{
	
	void draw() {
		System.out.println("drawing shape");
	}
}

class Circle extends Shape{
	void draw()
	{
		System.out.println("drawing Circle");
	}
}

class Triangle extends Shape{
	
	void draw() {
		System.out.println("drawing triangle");
	}
}

public class RTimePolyMorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s;
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}