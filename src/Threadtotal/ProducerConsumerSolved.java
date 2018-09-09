package Threadtotal;
public class ProducerConsumerSolved
{

	int x ;
	boolean value_is_present = false;
	
	synchronized public void produce(int x)
	{
	 	if(value_is_present == true)
	 	{
	 		try 
	 		{
				wait();
				System.out.println("%%%%%%%%%% wait in produce() ");
				Thread.sleep(100);
				
	 		} 
	 		catch (InterruptedException e)
			{
				e.printStackTrace();
			}	 		
	 	}
		this.x = x;
		System.out.println("I have produce : "+this.x);
		value_is_present = true;
		notify();
	} 
 	synchronized public void consume()
	{
 		if(value_is_present == false)
 		{
 			try
 			{
				wait();
				System.out.println("####### wait in consume() ");
				Thread.sleep(100);
			
			}
 			catch (InterruptedException e)
			{
				e.printStackTrace();
			}	
 		}
		System.out.println("I have consume : "+this.x);
		value_is_present = false;
		notify();
	}
 	

	public static void main(String[] args)
	{
		ProducerConsumerSolved pc=	new ProducerConsumerSolved();
		new ProducerSolved(pc);
		new ConsumerSolved(pc);
	}
}
class ProducerSolved implements Runnable
{
	ProducerConsumerSolved p;
	public ProducerSolved(ProducerConsumerSolved p)
	{
		this.p = p;
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		short i=0;
		while(i<5)
		{
			p.produce(++i);
		}
	}
}
class ConsumerSolved implements Runnable
{
	ProducerConsumerSolved p;
	public ConsumerSolved(ProducerConsumerSolved p)
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
