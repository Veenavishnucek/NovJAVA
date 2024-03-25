package controlstmts;

import java.util.Scanner;

public class negativepositive {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the numbers:");
		 int a=0,b=0,c=0;
		 int ar [][]= new int[3][4];
		 for(int i=0;i<=2;i++)
		 {
			 for(int j=0;j<=3;j++)
			 {
				 ar[i][j]=sc.nextInt();
			 }
		 }

		 for(int i=0;i<=2;i++)
		 {
			 for(int j=0;j<=3;j++)
			 {
				 if(ar[i][j]>0)
				 {
					 a++;
				 }
				 else if(ar[i][j]<0)
				 {
					 b++;
					
				 }
				 else
					 {
						 c++;
					 }
				 
			 }
			 

		 }
		 System.out.println("Positive numbers :"+a);
		 System.out.println("Negative numbers :"+b);
		 System.out.println("Number of zeros:"+c);
		 
	}

}
