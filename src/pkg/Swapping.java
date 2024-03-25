package pkg;

public class Swapping {

	public static void main(String[] args) {
		int a=45,b=89,c;
		
		//---With variable---//
		System.out.println("---Before swapping--");
		System.out.println("a="+a);
		System.out.println("b="+b);

		c=a;
		a=b;
		b=c;
		System.out.println("---After swapping--");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//Without variable---//
		
		int x=10,y=4;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
		y+=x; //y=x+y;//
		x=y-x;
		y-=x; //y=y-x;//
		
		System.out.println("x="+x);
		System.out.println("y="+y);

		
		
		


	}

}
