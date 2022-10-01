/**
 * 
 */
package javaObjectClass;

/**
 * @author LSPL313
 *
 */

	class Account{
			
		String name;
		int accountNo;
		float amount;
		
		
		void insert(String n, int a, float amt) {
			name = n;
			accountNo = a;
			amount = amt;
		}
		
		void desposite(float amt){
			amount = amount+amt;
			System.out.println(amt +"deposited, Current Balance is : "+amount);
		}
		
		void widraw(float amt) {
			
			if(amount<amt) {
				System.out.println("Dont have sufficient balance, current balance is : "+amount);
			}else{
				amount=amount-amt;
				System.out.println(amt+" widraw, current balance is : "+amount);
			}
		}
			
			
		 void displayBalance(){
			 System.out.println("Current account balance is : "+ amount);
			
		}
		 
		 void displayAccountInfo() {
			 System.out.println("Account number: "+accountNo+","+ " Name of Account Holder: "+name+","+" Current Balance: "+amount);
		 }		
	}

public class RealBankExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account();
		ac.insert("Prashant Kashid", 10, 10000);
		ac.displayAccountInfo();
		
		ac.desposite(20000);
		ac.widraw(50000);
		ac.widraw(5000);

	}

}
