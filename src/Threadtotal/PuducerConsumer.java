package Threadtotal;
public class PuducerConsumer 
{

	int x ;
	public void produce(int x)
	{
		this.x = x;
		System.out.println("I have produce : "+this.x);
	}
	public void consume()
	{
		System.out.println("I have consume :"+this.x);
	}

	public static void main(String[] args)
	{
		PuducerConsumer pc=	new PuducerConsumer();
		new Producer(pc);
		new Consumer(pc);
	}
}
class Producer implements Runnable
{
	PuducerConsumer p;
	public Producer(PuducerConsumer p)
	{
		this.p = p;
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		short i=0;
		while(true)
		{
			p.produce(++i);
		}
	}
}
class Consumer implements Runnable
{
	PuducerConsumer p;
	public Consumer(PuducerConsumer p)
	{
		this.p = p;
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			p.consume();;
		}
	}
}
