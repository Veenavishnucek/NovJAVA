package controlstmts;

import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string:");
		String [] ar = new String[3];
		
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=2;i++)
        {
        	ar[i]= sc.next();
        }
		
       /* for(int i=0;i<=2;i++)
        {
        	System.out.println(ar[i]);
        }*/
        
        // foreach loop
        for(String v:ar)
        {
        	System.out.println(v);
        }
        
	
		

	}

}
