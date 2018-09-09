package Other;

import java.util.Scanner;

public class Planet 
{	
	  double getPlanetDegreeAtTime(long milliseconds)
	  {
	          return (milliseconds * 0.0001157)  %  360;
	  }

	   long getTimeInMillisecondsWhenPlanetIsAtDegree(double degree)
	   {	   
		   return (long) (degree/0.0001157);   
	   }
	
	public static void main(String[] args)
	{

		Planet pt = new Planet();
		while(true)
		{
		System.out.print("\nEnter the Millisecoand : ");
		long ms = new Scanner(System.in).nextLong();
		double degree = pt.getPlanetDegreeAtTime(ms);
		System.out.println("\nDegree : "+degree);
		long msres = pt.getTimeInMillisecondsWhenPlanetIsAtDegree(degree);
		System.out.println("\nResult getTimeInMillisecondsWhenPlanetIsAtDegree : "+ msres);
		}
		
	}
	
	
}
