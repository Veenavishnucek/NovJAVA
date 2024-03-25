package controlstmts;

public class reversestringpgm {

	public static void main(String[] args) {
		String str="Testing Training Center";
		str=str.trim();
		System.out.println(str);
		
		String [] words= str.split("\\s");
		int count =words.length;
		
		/*for(String w:words)
		{
			System.out.println(w);
		}*/
		
		
		
		for (int i=count-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
	}

}
