package Other;

import java.util.StringTokenizer;

public class SplitAndStrToken {

	
	public static void main(String[] args)
	{
		String s1= "java,.;lang:,;.&String";
		System.out.println(s1);
		
		String str[] = s1.split(".");
	//	String str[] = s1.split(",",2);
		System.out.println("by string split");
		
		for (String string : str) 
		{
			System.out.println(string);
		}
		System.out.println("\n\nby string tokenizer");
		StringTokenizer st = new StringTokenizer(s1,"&:,.;");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}	
}
