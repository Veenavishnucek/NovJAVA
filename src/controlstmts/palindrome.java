package controlstmts;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,d=1221;
		int temp=d;
		int k=0;
		
		while(d!=0)
		{
			s=d%10;
			k=k*10+s;
			d=d/10;
			
		}
		System.out.println("Number is "+temp);
		System.out.println("reverse is "+k);
		if(k==temp)
		{
			System.out.println("Paliandrome");
		}
		else
		{
			System.out.println("Not paliandrome");
		}

	}

}
