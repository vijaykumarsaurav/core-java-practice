package Other;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		System.out.print("Enter the String :");
		String str = new Scanner(System.in).nextLine();
		System.out.print("Enter the String :");
		String substr = new Scanner(System.in).nextLine();
		
		int os = subString(str,substr);
		System.out.println("No. of subString found : "+os);
	}

	private static int subString(String str,String substr) 
	{
		int counter=0;
		String ss="";
		int count=0;
		
		for (int i = 0; i < (str.length()-substr.length()+1); i++)
		{	
			counter =i;
			for (int j = 0; j < substr.length(); j++) 
			{
				ss += str.charAt(counter);
				counter++;
			}
			System.out.println(ss);
			if(ss.equalsIgnoreCase(substr))
			count++;
				ss = "";
		}
		return count;
	}
	
}
