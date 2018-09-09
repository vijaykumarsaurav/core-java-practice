package Threadtotal;

public class SameObjectMultipleThread extends Thread {

	public SameObjectMultipleThread() {
	Thread t1 = new Thread(this);
	Thread t2 = new Thread(this);
	Thread t3 = new Thread(this);
	t1.start();t2.start();t3.start();
	
	}

	/*
	 * Semaphore or lock or thread safe .
	 * only one thread access run() at a time till not complited
	 * when job done by one thread then 2nd thread start run();
	 */
	synchronized public void run()
	{						  
		System.out.print("[");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("ABC");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new SameObjectMultipleThread();
		
	}

}
