package pkg;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmatic Operator//
		
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));

		
		//Asignment Operators//
		int c;
		System.out.println(c=a);
		System.out.println(a+=b);  //a=a+b  a=20+10=30//
		System.out.println(a-=b);  //a=a-b  a=30-10=20//
		System.out.println(a/=b);
		System.out.println(a*=b);
		
		//Relational Operators//
		int v1=40,v2=20;
		System.out.println(v1==v2);
		System.out.println(v1>=v2);
		System.out.println(v1<=v2);
		System.out.println(v1>v2);
		System.out.println(v1<v2);
		System.out.println(v1!=v2);

		//Logical Operator//
		
	/*	A   B   A&&B   A||B   !A    !B
		
        0   0     0      0     1     1
        0   1     0      1     1     0
        1   0     0      1     0     1
        1   1     1      1     0     0  */
		
		String username="abc";
		String password="abc123";
		
		System.out.println(username=="abc"&&password=="abc123");
		System.out.println(username=="ab"&&password=="abc123");
		System.out.println(username=="abc"||password=="abc123");
		
		//Unary Operators//
		
		int v4=10;
		System.out.println(v4++);
		System.out.println(v4);
		System.out.println(++v4);
		System.out.println(++v4);
		
		//Ternary Operators//
		
		String x= v1>v2?"V1 is greater":"v2 is greater";
		System.out.println(x);
		

		






	}

}
