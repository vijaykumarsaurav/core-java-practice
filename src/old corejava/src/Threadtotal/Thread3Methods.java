package Threadtotal;

public class Thread3Methods  extends Thread
{

	public Thread3Methods() {
		Thread t1= new Thread(this);
		Thread t2= new Thread(this);
		t1.start();
		t2.start();
		
		}
	
	public void run()
	{
		System.out.println("THREAD IS START ");
		try {
			method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method2();
		method3();
		System.out.println("THREAD IS END");
		
	}
	void method1() throws InterruptedException
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Method 1 : "+i);
			Thread.sleep(200);
		}
	}
	void method2()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Method 2 : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}void method3()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Method 3 : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("CONN IS ESTABLISD ");
		new Thread3Methods();
		System.out.println("CONN IS TERMINTED");
	}
}
