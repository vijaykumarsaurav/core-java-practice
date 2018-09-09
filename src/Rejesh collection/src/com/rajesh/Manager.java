package com.rajesh;

import java.util.HashSet;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("901");
		set.add("902");
		set.add("903");
		set.add("904");
		System.out.println(set.add("905"));
		System.out.println(set.add("906"));
		System.out.println(set.add("901"));
		
		System.out.println(set);
		System.out.println(set.size());
		
		HashSet<Integer> ish = new HashSet<Integer>(); 
		ish.add(new Integer(10));
		ish.add(new Integer(20));
		ish.add(new Integer(30));
		ish.add(new Integer(40));
		ish.add(new Integer(40));
		ish.add(new Integer(50));
		System.out.println(ish);
		System.out.println(ish.size());
		System.out.println(set);
	}

}
