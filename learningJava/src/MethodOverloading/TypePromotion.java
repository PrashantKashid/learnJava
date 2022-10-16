/**
 * 
 */
package MethodOverloading;

/**
 * @author LSPL313
 *
 */
public class TypePromotion {

	/**
	 * @param args
	 */
	
	 void sum(int a,long b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion tp = new TypePromotion();
		tp.sum(10,10);
		tp.sum(10,20,30);

	}

}
