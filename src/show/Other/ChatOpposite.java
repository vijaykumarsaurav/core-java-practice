package Other;

import java.util.Scanner;

public class ChatOpposite {

	public static void main(String[] args) {
		System.out.print("Enter the String :");
		String str = new Scanner(System.in).nextLine();
		String os = charOpp(str);
		System.out.println("Opposite String : "+os);

		System.out.println();
		String os2 = charOppWithAPI(str);
		System.out.println("Opposite String : "+os2);

	}

	//using java wrapper class
	private static String charOppWithAPI(String str) 
	{
		String os="";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				os += Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				os += Character.toUpperCase(ch);
		}
		return os;
	}

	//without wrapper own calculation
	private static String charOpp(String str)
	{
		String os = "";
		for (int i = 0; i < str.length(); i++)
		{
			int d = str.charAt(i);
			if(d >= 65 && d <= 91)
				os += (char)(d+32);
			else if(d >= 97 && d <= 123)
				os += (char)(d-32);
		}
		
		return os;
	}
	
	
}
