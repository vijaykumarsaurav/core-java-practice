package StringReverse;
import java.util.Scanner;
public class ReverseString
{	
	
	
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		ReverseString rs = new ReverseString();
		System.out.println("Enter the any string :");
		String s = scan.nextLine();
		String s1="";
		String str[] = rs.vSplit(s);
		//storing of output sub string
		String ostr[] = new String[str.length];
		//spliting using own funtion and store in output string array
		for(int i=0;i < str.length;i++)
		{
			ostr[i]= rs.vReverse(str[i]);
		}
		//displaying reverse of sub sting
		for(String sub : ostr)
		{
			System.out.print(sub + " ");
		}
			
	}
	String vReverse(String s)
	{
		String s1="";
		ReverseString rs = new ReverseString();
		//using own lengh function
		for(int i=rs.vLegth(s)-1;i>=0;i--)
		{
			s1 = s1 +s.charAt(i);
		}
		return s1;
	}
	
	String [] vSplit(String s)
	{	String s1="";

		int count = 0,size = 1 ;
		//check the no. of string in main string 
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

	public int vLegth(String s)
	{
		int i=0;
		char ch[] = s.toCharArray();
		try
		{
		while(ch[i] != '\0')
		{
			i++;
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println("");
		}
		return i;
	}
}
