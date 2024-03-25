package controlstmts;

public class else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=120,b=40,c=68;
           
           if(a>b && a>c)
           {
        	   System.out.println("a is greater");
        	  
           }
           
           else if(b>a && b>c)
           {
        	   System.out.println("b is greater");
 
           }
           
           else
           {
        	   System.out.println("c is greater");

           }
           
	}

}
