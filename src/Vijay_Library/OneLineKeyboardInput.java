package Vijay_Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OneLineKeyboardInput 
{
	public static void main(String[] args)
	{
	
			//	String str = new Scanner(System.in).nextLine();
		System.out.print("Through Scanner \nEnter the string :-");
		System.out.println(new Scanner(System.in).nextLine());
		
		
		System.out.print("Through  InputStreamReader \n Enter the string :-");
	// 	BufferedReader br= new BufferedReader(new InputStreamReader(System.in)).readLine();
		try
		{
			System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
