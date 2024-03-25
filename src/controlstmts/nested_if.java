package controlstmts;

public class nested_if {

	public static void main(String[] args) {
		int age=19,wt=55;
		if(age>=18)
		{
			if(wt>=50)
			{
				System.out.println("Eligible to donate blood");
			}
			
			else
			{
				System.out.println("Weight should be greater than 50");
			}
			
		}
		else
		{
			System.out.println("Age should be greater than 18");

		}
	}
}
