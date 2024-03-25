package oops;

class Animal1
{
	public void animalmthd()
	{
		System.out.println("Animal details");
	}
}

class Lion extends Animal1
{
	public void lionmthd()
	{
		System.out.println("Lion details");
	}
}

class Tiger extends Animal1
{
	public void tigermthd()
	{
		System.out.println("Tiger details");
	}
}


public class hierarchialinheritance {

	public static void main(String[] args) {
		
		Lion ob=new Lion();
		ob.animalmthd();
		ob.lionmthd();
		
		Tiger ob1=new Tiger();
		ob1.animalmthd();
		ob1.tigermthd();
		
	}

}
