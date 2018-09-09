package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println("Current date ");

		System.out.println("date : "+cal.get(Calendar.DATE));
		System.out.println("month : "+cal.get(Calendar.MONTH));
		System.out.println("year : "+cal.get(Calendar.YEAR));

		System.out.println("\nhour : "+cal.get(Calendar.HOUR));
		System.out.println("minute : "+cal.get(Calendar.MINUTE));
		System.out.println("second : "+cal.get(Calendar.SECOND));

		Calendar cal1 = Calendar.getInstance();

		cal1.set(Calendar.DATE, 4);
		cal1.set(Calendar.MONTH, 0);
		cal1.set(Calendar.YEAR, 2015);

		System.out.println("\nsetted date ");

		System.out.println("date : "+cal1.get(Calendar.DATE));
		System.out.println("month : "+cal1.get(Calendar.MONTH));
		System.out.println("year : "+cal1.get(Calendar.YEAR));

		System.out.println(cal.after(cal1));
		System.out.println(cal1.after(cal));
		System.out.println(cal.after(cal));
		System.out.println(cal.compareTo(cal1));
		System.out.println(cal1.compareTo(cal1));
		System.out.println(cal1.compareTo(cal));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println(cal1.getFirstDayOfWeek());
		System.out.println(cal.getLeastMaximum(Calendar.DATE));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal1.getTimeInMillis());
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		TimeZone tz = cal.getTimeZone();
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getDisplayName(Locale.CANADA));

		long l1 = cal.getTimeInMillis();
		long l2 = cal1.getTimeInMillis();
		long l3 = l2 - l1;
		Date rd = new Date(l3);
		System.out.println(rd.getDate());
		System.out.println(rd.getMonth());
		System.out.println(rd.getYear());

	
		

	}

}
