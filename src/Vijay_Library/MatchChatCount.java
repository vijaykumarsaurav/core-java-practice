package Vijay_Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatchChatCount {

	static int matchCount(String str,char ch)
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(ch == str.charAt(i))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.print("Enter the string :-");
		String str = new Scanner(System.in).nextLine();
		System.out.print("Enter the one character :-");
		
		try 
		{
			char ch = (char)System.in.read();
			int count = MatchChatCount.matchCount(str, ch);
			System.out.println(count);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
