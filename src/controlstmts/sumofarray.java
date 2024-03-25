package controlstmts;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an array of 5 numbers:");
		int [] ar= new int[5];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<=4;i++) 
		{
			ar[i]= sc.nextInt();
		}
		
		System.out.println("The sum of array is:");
		int a=0;
		for( int i=0;i<=4;i++)
		{
			a=a+ar[i];
		}
		System.out.println(a);
	}
		

	

}
