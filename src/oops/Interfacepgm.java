package oops;

interface Home2
{
	public void room();
}


interface Furniture
{
	public void materials();
}


class Flat implements Home2,Furniture
{

	@Override
	public void room() 
	{
		System.out.println("Flat Room Details");
		
	}

	@Override
	public void materials()
	{
		System.out.println("Material Details");
      
	}
}

class Villa implements Home2
{

	@Override
	public void room() {
		System.out.println("Villa room details");
		
	}
	
}


public class Interfacepgm {

	public static void main(String[] args) {
		
		Home2 ob7 =new Flat();
		ob7.room();
		ob7=new Villa();
		ob7.room();
		
		Furniture vl=new Flat();
		vl.materials();
		
		
		
	}

}
