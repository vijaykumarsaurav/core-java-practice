package Ram;

import java.util.Scanner;

public class Days 
{

	int d=0,m=0,y=0,lm=0,days=0;	
	void calDate()
	{
		
		System.out.print("Enter the Starting Date (DD MM YYYY) : ");
	//	int sd1 = new Scanner(System.in).nextInt();
	  //  int sm1 = new Scanner(System.in).nextInt();
       // int sy1 = new Scanner(System.in).nextInt();
        
	   String str = new Scanner(System.in).nextLine();
	   String s[]= str.split("-");
	   int sd1 = Integer.parseInt(s[0]);
	   int sm1 = Integer.parseInt(s[1]);
	   int sy1 = Integer.parseInt(s[2]);
	   
	       
		System.out.print("Enter the Ending Date (DD MM YYYY) : ");
		//int ed1 = new Scanner(System.in).nextInt();
        //int em1 = new Scanner(System.in).nextInt();
       // int ey1 = new Scanner(System.in).nextInt();
        

		 String str1 = new Scanner(System.in).nextLine();
	       String s1[]= str.split("-");
	   int ed1 = Integer.parseInt(s1[0]);
	   int em1 = Integer.parseInt(s1[1]);
	   int ey1 = Integer.parseInt(s1[2]);
	   
        if(ed1 >= sd1 )
        	d = ed1 - sd1;
        else
        {
            switch(em1)
            {
                case 1:
                {
                    lm=31;
                    break;
                }

                case 2:
                {
                    if((ey1%400==0 && ey1%100==0) || ey1%4==0)
                    lm=29;
                    else
                    lm=28;
                    break;
                }

                case 3:
                {
                    lm=31;
                    break;
                }
                case 4:
                {
                    lm=30;
                    break;
                }
                case 5:
                {
                    lm=31;
                    break;
                }

                case 6:
                {
                    lm=30;
                    break;
                }
                case 7:
                {
                    lm=31;
                    break;
                }
                case 8:
                {
                    lm=31;
                    break;
                }
                case 9:
                {
                    lm=30;
                    break;
                }
                case 10:
                {
                    lm=31;
                    break;
                }
                case 11:
                {
                    lm=30;
                    break;
                }
                case 12:
                {
                    lm=31;
                    break;
                }
            }
            d = (lm+ed1) - sd1;
            em1 = em1-1;

            if(em1 >= em1)
            m = em1-sm1;

            else
            m = (em1+12) - sm1;
            y = ey1 - sy1;
            int ly = y/4;
            int ny = y - ly;
            days = (ny*365)+(ly*366)+(m*30)+d;
            String ds = String.valueOf(days);
            //  ol.setText(" Total Days : "+ds);
        }
        float f= (float)((y*12)+m)/12;
        float fy = (float)(y*12)+m;
        System.out.println("Year :"+y);
        System.out.println("Month :"+m);
        
        System.out.println("Total Year : "+f);
        System.out.println("Total Months : "+fy);
        System.out.println("Total Days : "+days);
		
	}
	
	public static void main(String[] args) 
	{
		
			new Days().calDate();
		
	}

}
