package controlstmts;

import java.util.Scanner;

public class arraypgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*  int [] ar = new int[3];
        ar[0]=23;
        ar[1]=67;
        ar[2]=45;
        
        for(int i=0;i<3;i++) 
        {
        System.out.println(ar[i]);	
        } */
		
		
		int [] ar= new int [3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		for( int i=0;i<=2;i++)
		{
			ar[i]= sc.nextInt();
		}
		
		System.out.println("The numbers are:");
		/*for(int i=0;i<3;i++) 
        {
        System.out.println(ar[i]);	
        } */
		
		for(int v:ar)
		{
		  System.out.println(v);	
		}

		
		
		
	}

}
