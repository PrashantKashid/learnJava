/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */

 class Rectangle2{
	 
	int length, width;
	
	void insert(int l , int w){
		length = l;
		width =w;
	}
	
	void calculateArea() {
		System.out.println(length*width);
	}
	
}


public class CreatingMultipleObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle2 r1 = new Rectangle2(), r2 = new Rectangle2();
		r1.insert(5, 6);
		r2.insert(8, 9);
		r1.calculateArea();
		r2.calculateArea();
		

	}

}
