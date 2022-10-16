/**
 * 
 */
package MethodOverridding;

/**
 * @author LSPL313
 *
 */

class Bank{
	int getROI()
	{
	
		return 0;
	}
}


class SBI extends Bank{
	int getROI()
	{
	
		return 7;
	}
}

class ICICI extends Bank{
	int getROI()
	{
	
		return 8;
	}
}

class Maharashtra extends Bank{
	int getROI()
	{
	
		return 8;
	}
}

public class RealTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s = new SBI();
		System.out.println(s.getROI());
		ICICI i = new ICICI();
		System.out.println(i.getROI());

	}

}
