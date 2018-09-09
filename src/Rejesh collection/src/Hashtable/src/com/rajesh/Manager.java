package Hashtable.src.com.rajesh;

import java.util.Hashtable;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Comparable, String> table=new Hashtable<Comparable, String>();
		table.put("abc", "v1");
		table.put(100, "x1");
		table.put(10.09, "tree");
		table.put(11, "tree");		
		table.put(12, "tree");
		table.put(13, "tree");
		table.put(13, "vijay");
		
		System.out.println(table);
		

	}

}
