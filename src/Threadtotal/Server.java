package Threadtotal;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable 
{
	static ServerSocket ss;
	static Socket s;
	PrintStream ps = null;
	public void run()
	{
		String name = Thread.currentThread().getName();
		while(true)
		{
			System.out.println("The thread :"+name+" ready to accept ...");
			try {
				s = ss.accept();
				ps = new PrintStream(s.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("thread "+name+" accepted the connection ");
			ps.println("Thread "+name +" contected  you");
			ps.close();
			
		}
	}
	
	
	public static void main(String[] args) throws IOException
	{

		Server ser = new Server();
		ss = new ServerSocket(999);
		Thread t1 = new Thread(ser,"One");
		Thread t2 = new Thread(ser,"Two");
		
		t1.start();
		t2.start();
	}

}
