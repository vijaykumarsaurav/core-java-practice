package factory;

import java.text.NumberFormat;
import java.util.Locale;

public class FactoryMethod {

	public static void main(String[] args) {
		
		double pi = 3.1416d;
		double r =23.44;
		double area = pi * r;
		System.out.println("area : "+area);
		NumberFormat obj=  NumberFormat.getNumberInstance(Locale.CANADA_FRENCH);
		obj.setMaximumFractionDigits(2);
		obj.setMinimumIntegerDigits(5);
		String sarea = obj.format(area);
		System.out.println(sarea);
	
	}
}
