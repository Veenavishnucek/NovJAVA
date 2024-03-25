package controlstmts;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=45678;
		int l,x=0;
		
		while(k>0)
		{
			//System.out.print(k%10);
			//k=k/10;	
			l= k%10;
			x=x*10+l;
			k=k/10;
		}
		System.out.print(x);

	}

}
