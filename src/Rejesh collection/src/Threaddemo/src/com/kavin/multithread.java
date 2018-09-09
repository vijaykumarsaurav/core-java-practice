package com.kavin;

class newthread implements Runnable {
	Thread tl;
	newthread(){
		tl=new Thread(this,"deom thread");
		System.out.println("child thread"+tl);
		tl.start();
		
	} 

	
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println("child thread"+i);
				Thread.sleep(50);
			}
			
		}
		catch(InterruptedException ex){} 
		System.out.println("child interupptted");
	}
	}

public class multithread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new newthread();
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println("main thread:"+i);
				Thread.sleep(100);
			}
			
		}
		catch(InterruptedException ex){
			System.out.println("main thread interrupt");
			
		}
		

	}

}
