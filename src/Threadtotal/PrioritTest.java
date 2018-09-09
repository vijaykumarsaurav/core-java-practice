package Threadtotal;

class Myclass extends Thread
{
	int count=0;
	public void run()
	{
		for(int i=0;i<100;i++)
			System.out.print(i+" ");
		System.out.println("\nComplited thread :"+Thread.currentThread().getName());
		System.out.println("Complited thread :"+Thread.currentThread().getPriority());
		
	}
}
public class PrioritTest
{
	public static void main(String[] args)
	{
		Myclass mbj = new Myclass();
		Thread t1 = new Thread(mbj," First thread ");
		Thread t2 = new Thread(mbj," Secoand thread ");
	
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
	}
}

