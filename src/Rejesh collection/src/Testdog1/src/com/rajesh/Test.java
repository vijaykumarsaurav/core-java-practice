package com.rajesh;
class animal{
	public void move(){
		System.out.println("animal can move");
	}
}
class dog extends animal{
	public void move(){
		System.out.println("dog can move & walk");
	}
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new animal();
		a.move();
		animal b=new dog();
		b.move();

	}

}
