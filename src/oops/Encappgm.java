package oops;

class Empdetails
{
	private String Empname;
	private int Empid;
	
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	
	
}


public class Encappgm {

	public static void main(String[] args) {
		
		Empdetails ob = new Empdetails();
		//ob.Empname="Kiran";
		//System.out.println(ob.Empname);
		
		ob.setEmpid(101);
		ob.setEmpname("Radha");
		System.out.println("ID="+ob.getEmpid());
		System.out.println("Name="+ob.getEmpname());
		
	}

}
