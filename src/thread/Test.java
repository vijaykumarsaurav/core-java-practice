package thread;

import java.util.HashSet;

public class Test extends Thread
{



	public static void main(String[] args) {


		System.out.println("From Main Thread ");
		
		
		try {
			System.out.println("Thread  1 start ");
			Thread1 th1 = new Thread1();
			th1.sleep(5000);
			System.out.println("Thread  1 end ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Thread  2 start ");
			Thread2 th2 = new Thread2();
			th2.sleep(5000);
			System.out.println("Thread  2 end ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
