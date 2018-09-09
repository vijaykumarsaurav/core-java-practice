package Collection;

import java.util.Date;
import java.util.GregorianCalendar;

public class DaysTest {

	public static void main(String[] args) {


		System.out.println(new Date());
		//System.out.println(new Date().parse("02-02=2002"));
		System.out.println(new Date().getDate());
		System.out.println(new Date().toLocaleString());
		Date dd = new Date();
		dd.setDate(10);
		dd.setMonth(4);
		dd.setYear(113);
		long ld = dd.getTime();
		
		Date dd1 = new Date();
		dd1.setDate(20);
		dd1.setMonth(4);
		dd1.setYear(113);
		long ld1 = dd1.getTime();
		long md = ld1-ld;
		Date td = new Date(md);
		System.out.println(ld);
		System.out.println(ld1);
		System.out.println(td.getDay());
		System.out.println(td.getMonth());
		System.out.println(td.getYear());
		td.setYear(113);
		System.out.println(dd.toLocaleString());
		System.out.println(dd1.toLocaleString());
		
		System.out.println(td.toLocaleString());
		System.out.println(new Date().getYear());
		GregorianCalendar gd=new GregorianCalendar(10,2,2013);
		System.out.println(gd.getTime());
		System.out.println(gd.getTimeInMillis());
		
		//System.out.println(new Date().getTime());
		

	}

}
