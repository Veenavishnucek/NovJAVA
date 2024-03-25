package controlstmts;

import java.util.Scanner;

public class largestinarray {

	public static void main(String[] args) {

     System.out.println("Enter an array of numbers:");
     Scanner sc=new Scanner(System.in);
     int [] ar= new int [6];
     for(int i=0;i<6;i++)
     {
    	 ar[i]=sc.nextInt();
     }

     int large=ar[0];
     for(int j=1;j<6;j++)
     {
    	 if(ar[j]>large)
    	 {
    		large=ar[j]; 
    	 }
     }
     
     System.out.println("Largest:"+large);
     
     
	}

}
