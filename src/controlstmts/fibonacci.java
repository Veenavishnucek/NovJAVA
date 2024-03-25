package controlstmts;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		System.out.println("The Fibonacci series is:");
		int ft=0;
		int st=1;
		int nt;
		
		while(ft<100) 
		    {
			System.out.print(" "+ft);
		    nt=ft+st;
			ft=st;
			st=nt;
			}
		
		

	}

}
