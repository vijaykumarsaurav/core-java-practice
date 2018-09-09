package Collection;

import java.awt.List;
import java.sql.Array;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class ArrayTest {

	public static void main(String[] args) {

		
	int arr[] = {10,15,13,20,17,30,18};
	display(arr,"Simple array :");
//	List l= Arrays.asList(arr);
	Arrays.sort(arr);
	display(arr,"Sorted :");
///	Arrays.fill(arr, 2);
	Arrays.fill(arr, 3, 5, 100);
	display(arr,"fill :");
	int i = Arrays.binarySearch(arr, 15);
	System.out.println(i);
	int g[] =  Arrays.copyOfRange(arr, 2, 5);
	display(g,"copyofrange :");
	boolean f = Arrays.equals(arr, arr);
	System.out.println(f);
	Object o[]={arr,g};
	String s=	Arrays.deepToString(o);
	System.out.println(s);
	int oa = Arrays.deepHashCode(o);
	System.out.println(oa);
	System.out.println(Arrays.hashCode(arr));
	System.out.println(Arrays.toString(arr));
//	DateFormat ff = new DateFormat("dd-mm-yyyy");
		
	int subarr[] = Arrays.copyOf(arr, 6);
	for (int j : subarr) {
		System.out.println(j);
	}
	}

	private static void display(int[] arr,String str) {
		
		System.out.println(str);
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	}

}
