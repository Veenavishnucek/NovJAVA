package controlstmts;

public class areapgm {

	public static void main(String[] args) {
     areapgm ob= new areapgm();
     ob.circle(2);
     ob.rect();
     System.out.println("area of a tirangle="+(ob.tri(6,3)));
     System.out.println("area of a square="+(ob.square()));
	}
	
	//without returntype, with parameter
	public void circle(int r)
	{
		double a= 3.14 *r*r;
		System.out.println("area of a circle="+a);
	}
	
	//without returntype,without parameter
	public void rect()
	{
		int l=4,b=5;
		int a=l*b;
		System.out.println("area of a rectangle="+a);
	}
	
	//with returntype,with parameter
	public double tri(int b, int h)
	{
		double a= (0.5)*b*h;
		return a;
		
	}
	
	//with returntype,witout parameter
	public int square()
	{
		int s=4;
		int a= s*s;
		return a;
	}
	
	
	

}
