package Other;

import java.util.GregorianCalendar;

public class Leap {

	public static void main(String[] args) {

		int y=100;
		int lc=0;
//check leap year
/*		{
			if(y%100==0 && y%400==0)
			{
				System.out.println("Century leap year");
				lc++;
			}
			else if(y%4==0)
				System.out.println("leap year");
			else 
				System.out.println("not leap year");
		}*/
		GregorianCalendar gc = new  GregorianCalendar();
		for (int i = 100; i <= 2000; i+=100)
		{
			System.out.println(i+" : "+gc.isLeapYear(i));		
		}
			
	}

}
