package controlstmts;

import java.util.Scanner;

public class repeatingletterpgm {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		
		int a=str.length();
		  
		char st[]= str.toCharArray();
		System.out.println(st);
		
		for(int i=0;i<a;i++)
		{
			int count=1;
			for(int j=i+1;j<a;j++)
			{
				if(st[i]==st[j])
				{
					count++;
					st[j]=0;
				}
			}
			if(count>1&&st[i]!=0)
			{
			System.out.println("no of "+st[i]+"="+count);
			}
		}
		
		
		
	}

}
