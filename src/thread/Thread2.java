package thread;

import java.util.HashSet;

public class Thread2 extends Thread {

	public Thread2() {
		start();
	}
	synchronized public void run()
	{
		new Addition().Addition1();
		new Substract().Substract1();
		new Multiplycation().Multiplycation1();
		new Division().Division1();
	
	}

}
