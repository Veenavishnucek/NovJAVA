package controlstmts;

import java.util.Scanner;

public class amstrongpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 3 digit number:");
		
		Scanner sc = new Scanner(System.in);
		int r=0,d,b,k,a = sc.nextInt();
		 k=a;
	
		while(a>0)
		{
		b = a%10;
		a = a/10;
        d = b*b*b;
		r= r+d;
		}
		
		if(k==r)
		{	
		    System.out.println("Amstrong number");
		}
		
		else
		{
			System.out.println("Not Amstrong number");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
