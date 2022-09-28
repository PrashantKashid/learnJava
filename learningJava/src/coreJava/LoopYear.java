/**
 * 
 */
package coreJava;

import java.util.Scanner;

/**
 * @author LSPL313
 *
 */
public class LoopYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check whether leap year");
		
		int year = sc.nextInt();
		
		if(((year%4==0)&&(year%100!=0)) || (year%400==0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("common Year");
		}
	}
}