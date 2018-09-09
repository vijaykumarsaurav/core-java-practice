package Threadtotal;
import java.io.*;
public class ThreadTest extends Thread
{
	boolean flag = false;
	ThreadTest()
	{
		start();
	}
	public void run()
	{

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
	public static void main(String[] args) throws IOException {
		ThreadTest tt = new ThreadTest();
		System.in.read();
		tt.flag = true;
	}
}


