package Threadtotal;

public class MyThread
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("i am the Main thread...starting......");

		final Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("i am thread 1 starting......");
				try{
					Thread.sleep(5000);
					System.out.println("I am Thread 1 finished ");
				}catch(InterruptedException ie){
					System.out.println("Exception:"+ie.getMessage());
				}
			}
		};

		final Thread t2 = new Thread()
		{
			public void run()
			{ 
				try{ 
					t1.join();
					System.out.println("I am Thread 2 finished ");
				}catch(InterruptedException ie){
					System.out.println("Exception:"+ie.getMessage());
				}
			}
		};

		Thread t3 = new Thread()
		{ 
			public void run()
			{ 
				try{
					t2.join(); 
					System.out.println("I am Thread 3 finished ");
				}catch(InterruptedException ie){
					System.out.println("Exception:"+ie.getMessage());
				}
			}
		};
		
		t1.start();
		t2.start(); 
		t3.start(); 
		t3.join();

		System.out.println("i am Main thread finished");

	}

}