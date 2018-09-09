package Threadtotal;

import java.io.IOException;

public class RannableTest  implements Runnable 
{
	boolean flag = false;

	public RannableTest() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		for(int i=0;i<10000;i++)
		{
			
			try {
				
				if(flag)
					return;
				System.out.println(i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		RannableTest tn = new RannableTest();
		try {
			System.in.read();
			tn.flag = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
