package controlstmts;

import java.util.Scanner;

public class wordcount {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		wordcount ob = new wordcount();
		ob.count(str);

	}

	public void count(String str)
	{
		str=str.trim();
		String [] words=str.split("\\s");
		int count=words.length;
		int c=0;
		for(String w:words)
		{
			c++;
			System.out.println(w);

		}
		
		System.out.println("Number of words:"+c);
		
		
		
		
		
		
		
		
		
		
		/*int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			char c = str.charAt(i);
			char d=str.charAt(i+1);
			if(c==' '&& d!=' '&&i!=0)
			{
				count++;
			}
			
		}*/
		
		//System.out.println("Number of words:"+count);
	}
}
