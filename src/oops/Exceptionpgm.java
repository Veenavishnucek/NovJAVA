package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream ob=new FileInputStream("E://Book1.xlsx");
		
		try {
			int a=40,b=0;
			double c=a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			//definitely gets executed
		}
		
		System.out.println("Hello");
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("nullpointer exception");
			
			
		}
		
		System.out.println("string length");
	}

}
