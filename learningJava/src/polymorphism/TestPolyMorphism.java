/**
 * 
 */
package polymorphism;

/**
 * @author LSPL313
 *
 */

class Bank{
	
	float getROI() {
		return 0;
	}	
}


class ICICI extends Bank{
	float getROI() {
		return 7;
	}
}

class SBI extends Bank{
	float getROI() {
		return 6;
	}
}

class CBI extends Bank{
	float getROI() {
		return 7;
	}
}

public class TestPolyMorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b;
		
		b= new SBI();
		System.out.println("SBI rate of intrest: "+b.getROI());
		
		b= new CBI();
		System.out.println("CBI rate of intrest: "+b.getROI());
		
		b= new ICICI();
		System.out.println("ICICI rate of intrest: "+b.getROI());
	}

}
