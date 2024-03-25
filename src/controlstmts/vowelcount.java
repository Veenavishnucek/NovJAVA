package controlstmts;

import java.util.Scanner;

public class vowelcount {

	public static void main(String[] args) {
    
		vowelcount ob= new vowelcount();
		System.out.println("Enter a string:");
		Scanner sc =new Scanner(System.in);
		String s= sc.next();
		
		ob.count(s);

	}
	
	public void count(String st)
	{
		//System.out.println(st);
		int a=0;
		
		for(int i=0;i<st.length();i++)
		{
			char b = st.charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
			{
				a++;
			}
			
		}System.out.println("Vowel count="+a);
		
		
	}

}
