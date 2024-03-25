package controlstmts;

import java.util.Scanner;

public class countofstring {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		//char [] ch=str.toCharArray();
		
		//String str="i am happy";
		int a=str.length();
		System.out.println(a);


	}

}
