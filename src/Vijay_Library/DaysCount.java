package Vijay_Library;

import java.util.Scanner;

public class DaysCount {


	public static void main(String[] args) 
	{
		System.out.println("Enter stating Date: ");
		String str = new Scanner(System.in).nextLine();
		String s[]= str.split("-");
		int sd = Integer.parseInt(s[0]);
		int sm = Integer.parseInt(s[1]);
		int sy = Integer.parseInt(s[2]);
		
		int sdays = countDays(sd,sm,sy);
	//	System.out.println("starting same year Days : "+sdays);

		System.out.println("Enter ending Date: ");
		String str1 = new Scanner(System.in).nextLine();
		String s1[]= str1.split("-");
		int ed = Integer.parseInt(s1[0]);
		int em = Integer.parseInt(s1[1]);
		int ey = Integer.parseInt(s1[2]);

		int edays = countDays(ed,em,ey);
	//	System.out.println("ending same yearDays : "+edays);

		int td = daysMinus(edays,ey,sdays,sy);
		long dml = (td*24*60*1000);
		System.out.println("\nRemain days: " +td);
		System.out.println("\nRemain months: " +(float)(td)/30);
		System.out.println("\nRemain years : " +(float)(td)/365);
		System.out.println("\nRemain Hours: " +(td*24));
		System.out.println("\nRemain Minutes: " +(td*24*60));
		System.out.println("\nRemain Millisecands: " +dml);


	}

	private static int daysMinus(int edays,int ey, int sdays,int sy) {

		int day=0;
		if (edays >= sdays)
		{
			day=edays - sdays;
		}
		else
		{
			day= (edays+365) - sdays;
			ey = ey-1;
		}
		int lc=0;
		for(int i=sy+1; i<ey ; i++)
		{
			if((i%100==0 && i%400==0) || i%4==0)
				lc++;
		}
		int y = ey-sy;
		int ny = y - lc;
		int tatalDays = (ny*365)+(lc*366)+day;


		return tatalDays;
	}

	private static int countDays(int d, int m, int y) {
		int ld=0;
		int days=0;
		if (m >= 3)
		{
			try{
				if(y%100 == 0)
				{    
					if(y%400 == 0)
					ld=1;
					else 
					ld = 0;
				}
				else if(y%4 == 0)
					ld = 1;
				else 
					ld =0;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		if(m == 1)
			days = d;
		else if(m == 2)
			days = 31 + d;
		else if(m == 3)
			days = 59 + ld + d;
		else if(m == 4)
			days = 90 + ld + d;
		else if(m == 5)
			days = 120 + ld + d;
		else if(m == 6)
			days = 151 + ld + d;
		else if(m == 7)
			days = 181 + ld + d;
		else if(m == 8)
			days = 212 + ld + d;
		else if(m == 9)
			days = 243 + ld + d;
		else if(m == 10)
			days = 273 + ld + d;
		else if(m == 11)
			days = 304 + ld + d;
		else if(m == 12)
			days = 334 + ld + d;

		return days;
	}

}
