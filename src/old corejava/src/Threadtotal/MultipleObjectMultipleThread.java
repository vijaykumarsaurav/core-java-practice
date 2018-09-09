package Threadtotal;

import java.util.Iterator;

public class MultipleObjectMultipleThread extends Thread{

	String name;
	public MultipleObjectMultipleThread(String name) {
	this.name = name;
	}
	synchronized public void run()
	{
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Name :"+name +"No : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {

		MultipleObjectMultipleThread mt1 = new MultipleObjectMultipleThread("cut the ticket");
		MultipleObjectMultipleThread mt2 = new MultipleObjectMultipleThread("show the sheet");
		mt1.start();
		mt2.start();
	}

}
