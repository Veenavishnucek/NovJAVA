package oops;

class Mother
{
	public void job()
	{
		System.out.println("Teacher");
	}
	
}


class Daughter extends Mother
{
	@Override
	public void job()
	{
		System.out.println("Engineer");
		super.job();
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		Daughter ob=new Daughter();
		ob.job();
		
	}

}
