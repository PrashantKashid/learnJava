/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */

class Rectangle1{
	
	int length;
	int width;
	
	void insert(int l, int w) {
		
		length = l;
		width = w;	
	}
	
	void calculateArea() {
		System.out.println(length*width);
	}
}

public class Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rectangle1 r1 = new Rectangle1();
		Rectangle1 r2 = new Rectangle1();
		r1.insert(5, 6);
		r1.calculateArea();
		r2.insert(7, 6);
		r2.calculateArea();
	}
}
	
	
	
