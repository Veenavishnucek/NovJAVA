package controlstmts;

public class Helloworld {

	public static void main(String[] args) {
		 
	String st= "Hello world";
	System.out.println(st.replace("Hello", "Hi"));
	
	String sr="Java is a platform independent language";
	String sub="language";
	if(sr.contains(sub))
	{
		System.out.println("Contains substring");
	}
	else
	{
		System.out.println("Substring not present");
	}

	}

}
