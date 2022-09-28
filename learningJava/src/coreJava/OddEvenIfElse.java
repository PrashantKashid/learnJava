/**
 * 
 */
package coreJava;

import java.util.Scanner;

/**
 * @author LSPL313
 *
 */
public class OddEvenIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit to test Even or Odd : ");
		int num = sc.nextInt();
		//int i =12;
		
		if(num%2==0) {
			System.out.println("Even number");
		}
		else{
			System.out.println("Odd number");
		}
	}
}