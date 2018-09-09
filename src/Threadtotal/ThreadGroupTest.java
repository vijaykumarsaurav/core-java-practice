package Threadtotal;

public class ThreadGroupTest
{

	public static void main(String[] args) 
	{
		Alpha al = new Alpha();
		Bita bi = new Bita();
		
		ThreadGroup tg = new ThreadGroup("First Group");
		
		Thread t1 = new Thread(tg,al," 1st thread ");
		Thread t2 = new Thread(tg,al," 2nd thread ");
		
		ThreadGroup tg1 = new ThreadGroup(tg,"Second Group");
		
		Thread t3 = new Thread(tg1,bi," 3rd thread ");
		Thread t4 = new Thread(tg1,bi," 4th thread ");
		
		System.out.println("Parent of thread : "+tg.getParent());
		System.out.println("Parent of 2nd group : "+tg1.getParent());
		
		tg1.setMaxPriority(9);
		System.out.println("Thread 1st Group : "+t1.getThreadGroup());
		System.out.println("Thread 2nd Group : "+t3.getThreadGroup());
		
		System.out.println("t1.isAlive :"+t1.isAlive());

		t3.start();t4.start();t1.start();t2.start();
		
		System.out.println("No. of thread active in tg :"+tg.activeCount());
		System.out.println("No. of group thread active in tg :"+tg.activeGroupCount());
		tg.setDaemon(true);
		System.out.println("isDaemon  :"+ tg.isDaemon());
		System.out.println("t1.isAlive :"+t1.isAlive());



	}

}
class Alpha extends Thread
{
	public void run()
	{
		System.out.println("Alpha class");
	}
}
class Bita extends Thread
{
	public void run()
	{
		System.out.println("Bita class");
	}
}