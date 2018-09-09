package Threadtotal;

public class AbcThreadAlpha implements Runnable
{

	Thread thread ;
	public AbcThreadAlpha() 
	{
		thread = new Thread(this);
		thread.start();	
	}
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("Dhoni");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class AbcThreadBita implements Runnable
{

	Thread thread ;
	public AbcThreadBita() 
	{
		thread = new Thread(this);
		thread.start();	
	}
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("Virat");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
