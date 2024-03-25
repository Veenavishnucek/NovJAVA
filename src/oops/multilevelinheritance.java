package oops;


class Apartments
{
	public void apartmentmthd()
	{
		System.out.println("Apartment details");
	}
}


class Home extends Apartments
 {
	public void homemethod()
	{
		System.out.println("Home details");
	}
 }

class Room extends Home
{
	public void roommethod()
	{
		System.out.println("Room details");
	}
}


public class multilevelinheritance {

	public static void main(String[] args) {
		
		Room rm = new Room();
		rm.homemethod();
		rm.apartmentmthd();
		rm.roommethod();

	}

}
