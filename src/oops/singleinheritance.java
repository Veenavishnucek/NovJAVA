package oops;


class Parent
{
	public void parentmethod()
	{
		System.out.println("parent details");
	}
}

class Child extends Parent
{
	public void childmethod()
	{
		System.out.println("child details");
	}
}


public class singleinheritance {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.parentmethod();
		ob.childmethod();
		
		

	}

}
