package Threadtotal;

public class MultipleThreadSingleObj implements Runnable {

	int aval =2;
	int wanted;
	public MultipleThreadSingleObj(int w) {

		this.wanted = w;
	}
	public void run()
	{
		synchronized(this)//without synchronized both thread resurve the sheet 
		{
			System.out.println("Available breath : "+ aval);
		
		if(aval >= wanted)
		{ 
			String name = Thread.currentThread().getName();
			System.out.println(wanted + " sheet resurved for : "+name);
			try {
				Thread.sleep(1000);
				aval = aval-wanted;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		else System.out.println("Sorry , no sheet ");
	}}
	public static void main(String[] args) {
		MultipleThreadSingleObj obj = new MultipleThreadSingleObj(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		t1.setName("Gopi");
		t2.setName("Topi");
		t3.setName("Ropi");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
