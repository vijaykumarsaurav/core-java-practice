package com.raju;
class A extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			
		}
		
		
	}
}

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		a1.start();
		System.out.println("hello");

	}

}
