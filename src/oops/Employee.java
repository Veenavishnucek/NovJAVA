package oops;

public class Employee {
	
	String empname;
	int empid;
	
	
	public Employee(String empname,int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
	
	
	public void display()
	{
		System.out.println("empname="+empname);
		System.out.println("empid="+empid);
	}

	public static void main(String[] args) {
		Employee emp1=new Employee("Ram",101);
		emp1.display();
		//System.out.println("Employee name="+emp1.empname);
		Accessmodifier ob=new Accessmodifier();
		System.out.println(ob.b);
        System.out.println(ob.c);
	}

}
