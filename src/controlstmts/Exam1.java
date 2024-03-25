package controlstmts;

public class Exam1 {

	public static void main(String[] args) {
		
	/*for(int i=6;i>0;i--)
	{
		int n=1;
		for(int j=0;j<i;j++)
		{
			System.out.print(n);
			n++;
		}System.out.println();
	}*/
		
		String str="capitalaization";
		char [] ar= str.toCharArray();
		int l= str.length();
		
		for(int i=0;i<l;i++)
		{
			int count=1;
			for (int j=i+1;j<l;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]=0;
				}
			}
			
			if(count>1&&ar[i]!=0)
			{
				System.out.println(ar[i]+" repeats "+count+" times");
			}
			
		}
		
	}
	}


