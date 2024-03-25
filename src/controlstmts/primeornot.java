package controlstmts;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int r,c=0;
		if(n==0||n==1)
		{
			System.out.println("neither prime nor composite");
		}
		
		
		else
		{
		for(int i=1;i<=n/2;i++)
		{
			r=n%i;
			if(r==0)
			{
				c++;
			}
			
		}
		
		if(c>1)
		{
			System.out.println("Composite number");
		}
		else
		{
			System.out.println("Prime number");
		}
		}
	}

}
