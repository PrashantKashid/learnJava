/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */

class Bikes{
	int speed=100;
}


class Hero extends Bikes{
	
	int speed =90;
}

public class RTPolyNotWorkWithDataMember {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bikes b;
		b= new Hero();
		System.out.println(b.speed);// here data member of Hero class not can not be refer.
	}
}