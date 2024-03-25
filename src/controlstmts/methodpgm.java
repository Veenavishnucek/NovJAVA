package controlstmts;

public class methodpgm {

	public static void main(String[] args) {
      methodpgm ob=new methodpgm();
      ob.add();
      ob.sub(9,3);
      System.out.println(ob.mul(4,8));
      System.out.println(ob.div());
	}
	
	//1. Method without returntype and without parameter
      public void add()
      {
    	  int a=20,b=30;
    	  int c=a+b;
    	  System.out.println(c);
      }
      
    //2.Method without returntype and with parameter
      public void sub(int a,int b)
      {
    	  float c=a/b;
    	  System.out.println(c);
      }
      
    //3.Method with returntype and with parameter
      public int mul(int a,int b)
      {
    	  int c=a*b;
    	  return c;
      }
      
    //4.Method with returntype and without parameter
      public int div()
      {
    	  int a=80,b=2;
    	  return (a/b);
      }
      
      
}
