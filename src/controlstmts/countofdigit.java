package controlstmts;

public class countofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int k=123456;
           int b=0;
           
           while(k>0)
           {
        	 
        	   k=k/10;
        	   b++;
        	    
           }
           System.out.println("Count of digit = "+b);
	}

}
