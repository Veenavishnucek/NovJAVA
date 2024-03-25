package oops;

public class Methodoverloading {

	public static void main(String[] args) {
	Methodoverloading ob = new Methodoverloading();
	ob.add(3,5);
	ob.add(5.6, 90);
	ob.add(45, 6.7);	
	}
	
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}

	
	public void add(int a,double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	

}
