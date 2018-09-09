package Other;

import java.util.Scanner;

public class OneCharInchar {


	public static void main(String[] args) {
		System.out.print("Enter the String :");
		String str = new Scanner(System.in).nextLine();
		String os = charIn(str);
		System.out.println("Incremented String : "+os);
	}

	private static String charIn(String str)
	{	
		String os = "";
		char ch;
		for(int i = 0; i <str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c == 'z' || c == 'Z')
			{
				if(c == 'Z')
					os += 'A';
				else if (c == 'z')
					os += 'a';
			}
			else 
			{
				int d = c;
				d++;
				os+=(char)d;
			}
		}
		return os;
	}
	
}
