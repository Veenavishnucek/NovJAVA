package oops;

abstract class Car
{
	abstract public void speedlimit();
	public void cardetails()
	{
		System.out.println("cardetails");
	}
}


class Maruti extends Car
{
	@Override
	public void speedlimit()
	{
		System.out.println("Maruti car details");
	}
	
}


class Kia extends Car
{

	@Override
	public void speedlimit() 
	{
	      System.out.println("Kia car details");	
		
	}
	
}


public class Abstractclass
{

	public static void main(String[] args) {
		Maruti mt= new Maruti();
		mt.cardetails();
		mt.speedlimit();
		
		Kia ka= new Kia();
		ka.cardetails();

	}
	
}
