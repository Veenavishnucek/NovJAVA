package controlstmts;

public class pyramidpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
         for(int i=1;i<=5;i++)
         {
        	 for(int k=1;k<=(5-i);k++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=(2*i-1);j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }

	}

}
