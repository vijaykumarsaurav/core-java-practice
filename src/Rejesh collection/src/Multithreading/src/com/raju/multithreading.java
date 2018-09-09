package com.raju;
class A extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);

		}
			}
}

public class multithreading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		a1.start();
		try {
			a1.join();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		System.out.println("parent");
		

	}

}
