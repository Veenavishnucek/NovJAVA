package controlstmts;

import java.util.Scanner;

public class additonpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 number:");
		
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c = a+b;
        
        
        System.out.println("Sum of " +a +" and " +b +" is " +c);
	}
}
