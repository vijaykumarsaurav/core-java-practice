package Vijay_Library;
import java.util.Scanner;

public class StringLength 
{	
	public static int vLegth(String s)
	{
		int i=0;
		char ch[] = s.toCharArray();
		
		
		try
		{
		while(ch[i] != '\0')
		for (char c : ch)
		{
			
		
			i++;
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("");
		}
		return i;
	}
	public static void main(String[] args)
	{
		System.out.print("Through Scanner \nEnter the string for count length:-");
		int len = StringLength.vLegth(new Scanner(System.in).nextLine());
		System.out.println("Length : "+len);	
	}

}
