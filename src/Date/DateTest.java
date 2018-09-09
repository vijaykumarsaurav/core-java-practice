package Date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class DateTest {

	public static void main(String[] args) {

		Date cd = new Date();
		System.out.println(cd);
		System.out.println();
		
		Date d = new Date();
		 d.setDate(10);
		 d.setMonth(0);
		 d.setYear(114);
		 System.out.println(d);
		 
		 System.out.println(d.after(cd));
		 System.out.println(cd.before(d));
		 System.out.println(d.compareTo(cd));
		 System.out.println(cd.compareTo(cd));
		 System.out.println(cd.compareTo(d));
		 System.out.println(cd.getDate());
		 System.out.println(cd.getMonth());
		 System.out.println(cd.getYear());
		 System.out.println(cd.getTime());
		 System.out.println(cd.getTimezoneOffset());
		 System.out.println(cd.toGMTString());
		 System.out.println(cd.toLocaleString());
		 
		 DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		 String sd=  df.format(d);
		 System.out.println(sd);
		 
		 DateFormat dt = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT,Locale.US);
		 String sdt=  dt.format(d);
		 System.out.println(sdt);
		 
		 
		 
		 
		 
		 
	}

}
