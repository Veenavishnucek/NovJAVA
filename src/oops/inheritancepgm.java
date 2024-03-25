package oops;

class Member
{
	public String name;
	public int age;
	public long phoneno;
    public String address;
    public int salary;


	public void printdetails()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Phonenumber="+phoneno);
		System.out.println("Address="+address);
		System.out.println("Salary="+salary);
	}
}

class Employee2 extends Member
{
	String specialization;
}

class Manager extends Member
{
	String department;
}


public class inheritancepgm {

	public static void main(String[] args) {
	

		Employee2 emp= new Employee2();
		emp.name="Kiran";
		emp.age=30;
		emp.phoneno=9898989898l;
		emp.address= "Kakkanad,Ernakulam";
		emp.salary=30000;
		System.out.println(emp.specialization="Tester");
		emp.printdetails();
		
		Manager mnr=new Manager();
		mnr.department="Testing";
		mnr.name="Ajay";
		System.out.println(mnr.department="HR");
		mnr.printdetails();
		
		
		
		
		
	}

}
