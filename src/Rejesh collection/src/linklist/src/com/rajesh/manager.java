package com.rajesh;

import java.util.LinkedList;

public class manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(90);
		ll.add(100);
		ll.add(50);
		ll.add(70);
		ll.add(90);
		System.out.println(ll);
		System.out.println(ll.removeFirst());		
		System.out.println(ll);
		System.out.println(ll.removeLast());
		System.out.println(ll);

	}

}
