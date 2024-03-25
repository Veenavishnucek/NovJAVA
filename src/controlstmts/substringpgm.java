package controlstmts;

import java.util.Scanner;

public class substringpgm {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		boolean a = str.contains("language");
		
		if(a==true)
		{
			System.out.println("Substring present");
		}
		else
		{
		System.out.println("Substring not present");
		}

	}

}
