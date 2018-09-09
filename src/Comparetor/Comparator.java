package Comparetor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Comparator {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{ 
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the no. of size :");
		int size = Integer.parseInt(br.readLine());
		Integer arr[] = new Integer[size];
		System.out.print("Enter the elements :");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr,new Asending());
		System.out.println("Acending order :");
		display(arr);
		System.out.println("Descending order :");
		Arrays.sort(arr,new Decending());
		display(arr);

	}
	static void display(Integer arr[])
	{
		for (Integer i : arr) {
			System.out.println(i);
		}
	}

}

class Asending implements java.util.Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) 
	{
		return i1.compareTo(i2);
	}
}

class Decending implements java.util.Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) 
	{
		return i2.compareTo(i1);
	}	
}

