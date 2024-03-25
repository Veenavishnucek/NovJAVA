package controlstmts;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
	sumofdigits ob = new sumofdigits();
		ob.count(num);
	}
	
	public void count(int num)
	{
		int s =0;
		while(num>0)
		{
			int a=num%10;
			s=s+a;
			num=num/10;
		}
		System.out.println("sum="+s);
		
	}

}
