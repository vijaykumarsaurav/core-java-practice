package string;



import java.io.*;

public class MyLibraryTest {

	public static void main(String[] args) throws Exception {

		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String :");
		String s1 = new String(br.readLine());
		System.out.println("Given Input String : "+s1);
	    char ch[]=	StringDuplicate.removeDuplicate(s1);
	    System.out.print("Unique String : ");
	    System.out.println(ch);
	    for(int i=0;ch[i] != '\0'; i++)
	    {
	    	System.out.println(ch[i]+" = "+StringDuplicate.matchCount(s1, ch[i]));
	    }

	}

}
