package controlstmts;

import java.util.Scanner;

public class multidimensional {

	private static char[] v;

	public static void main(String[] args) {
		
		int [][] ar= new int[2][3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The array is");
		/*for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		} */
		
		// for each loop
		for(int v1[]:ar)
		{
			for(int v2:v1)
			{
				System.out.print(v2+" ");
			}
			
			System.out.println();
		}

	}

}
