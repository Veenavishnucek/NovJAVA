package oops;

interface Basicanimal
{
	public void cat();
	public void sleep();
}

class Monkey 
{
	public void jump()
	{
		System.out.println("Jumping in the trees");
	}
	
	public void bite()
	{
		System.out.println("Monkey bites");
	}
}

class Human extends Monkey implements Basicanimal
{
	public void speak()
	{
		System.out.println("Humans speaks");
	}

	
	@Override
	public void cat() {
		System.out.println("Cat is cute");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep is must for everyone");
		
	}
}



public class Program2 {

	public static void main(String[] args) {
		
       Human ob = new Human();
       ob.bite();
       ob.cat();
       ob.sleep();
       ob.jump();
       ob.speak();
		
	}

}
