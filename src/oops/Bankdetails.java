package oops;

import java.util.Scanner;

interface Bank
{
	void accountdetails();
	void balance();
	void withdraw();
	void deposit();
}


class Federal implements Bank
{
     static String bankname="Federal";
	 int bal=5000;
	 int wd;
	 int dep;
	 int newbalance;
	 int accountno;
	 Scanner sc = new Scanner(System.in);
	  
	@Override
	public void accountdetails() {
		System.out.println("Enter  your account number:");
		accountno=sc.nextInt();
		System.out.println("Account holder name: Antony");
		System.out.println("Account number:009876");
		System.out.println("Branch: Kochi,Ernakulam,Kerala");
		System.out.println("IFSC Code:FB09877");
		}

	
	@Override
	public void withdraw() {
		System.out.println("Enter Withdrawal amount:");
	    wd= sc.nextInt();
	    if(bal<wd)
	    {
	    	System.out.println("Insufficient balance");
	    }
	    else
	    {
	    	bal=bal-wd;
	    }
		
	}

	
	@Override
	public void deposit() {
		System.out.println("Enter Deposite amount:");
	    dep= sc.nextInt();
	    bal=bal+dep;
		
	}

	@Override
	public void balance() {
		 System.out.println("New Balance="+bal);		
	}
	
}

public class Bankdetails {

	public static void main(String[] args) {
		Federal ob =new Federal();
		ob.accountdetails();
        ob.withdraw();
        ob.balance();
        ob.deposit();
        ob.balance();
	}

}
