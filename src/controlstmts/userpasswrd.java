package controlstmts;

import java.util.Scanner;

public class userpasswrd {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
        String [][] ar =new String [3][2];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				ar[i][j]=sc.next();
			}
		}
		
		System.out.println("The string array is:");
		for(String [] v1:ar)
		{
			for(String v2:v1)
			{
				System.out.print(v2+"  ");
			}
			System.out.println();
		}
		
	}

}
