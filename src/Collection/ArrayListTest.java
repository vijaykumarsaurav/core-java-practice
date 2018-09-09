package Collection;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListTest {
	public static  void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("vijay");
		al.add("vijay");
		al.add("vijay");
		System.out.println(al.add("vijay"));
		System.out.println(al.get(2));
		System.out.println(al.contains("vijay"));
		System.out.println(al.hashCode());
		System.out.println(al.remove("vijay"));
		System.out.println(al.indexOf("vijay"));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("vijay"));
		System.out.println(al.set(1, "Raj"));
		System.out.println(al.getClass());
		System.out.println(al);
		
		
		TreeSet ts=new TreeSet();
		ts.add("xyz");
		ts.add("ABC");
		ts.add("123");
		ts.add("200");
		ts.add("33");
		ts.add("abc");
		ts.add("abc");
		
		System.out.println(ts);
		System.out.println(ts.ceiling("a"));
		System.out.println(ts.comparator());
		System.out.println(ts.first());
		System.out.println(ts.floor("200"));
		//System.out.println(ts.higher(1));
		System.out.println(ts.hashCode());
		System.out.println(ts.last());
		
	}

}
