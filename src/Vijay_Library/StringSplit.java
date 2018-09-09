package Vijay_Library;
import java.util.Scanner;

public class StringSplit 
{

	static	String [] vSplit(String s)
	{	
		String s1="";
		int count = 0,size = 1 ;
		//check the no. of substring in main string 
		for (int d =0 ;d< s.length();d++)
		{
			if(s.charAt(d) == ' ')
			{
				size++;
			}
		}
		
		//declare the array of string of no. of sub string in main string
		String s2[]=new String[size];
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				s2[count] = s1;
				count++;
				s1 = "";
			}
			else 
			{
				s1 += s.charAt(i);
			}
		}
		s2[count] = s1;
		return s2;	
	}

	public static void main(String[] args)
	{

		System.out.println("Enter the String for split by space seperater :");
		String [] substr = StringSplit.vSplit(new Scanner(System.in).nextLine());
		for (String string : substr) 
		{
			System.out.println(string);
		}
	}

}
