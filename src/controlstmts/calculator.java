package controlstmts;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char act;
		
		System.out.println("Enter Two numbers:");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		do {
		System.out.println("Enter the choice from (+,-,*,/)");
		act= sc.next().charAt(0);
		
		switch(act)
		{
		case '+':System.out.println(a+"+"+b+"="+(a+b));
		       break;
		case '-':System.out.println(a+"-"+b+"="+(a-b));
	       break;
		case '*':System.out.println(a+"*"+b+"="+(a*b));
	       break;
		case '/':System.out.println(a+"/"+b+"="+(a/b));
	       break;
	       
	       default:System.out.println("Invalid choice");
	              
		        } 
		}while(act=='+'||act=='-'||act=='*'||act=='/');

	}

}
