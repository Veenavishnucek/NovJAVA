package controlstmts;

public class Employee {
	String empname;
	int empid;
	String empdesignation;
	static String companyname="Luminar";
	


	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.empid=101;
		emp1.empdesignation="Manager";
		System.out.println(companyname);
		System.out.println(emp1.empid);
		System.out.println(companyname="Luminar Technolab");
		System.out.println(companyname);
		System.out.println(emp1.empname="Abcd");

	}

}
