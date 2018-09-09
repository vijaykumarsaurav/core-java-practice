package Vijay_Library;
import java.util.Scanner;
public class StringReverse 
{
	
	static String vReverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1 = s1 +s.charAt(i);
		}
		return s1;
	}


	public static void main(String[] args)
	{
		System.out.println("Enter the any string :");
		System.out.println(StringReverse.vReverse(new Scanner(System.in).nextLine()));
	}

}
