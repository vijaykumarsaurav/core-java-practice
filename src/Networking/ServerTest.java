package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException 
	{
	
		ServerSocket	ss = new ServerSocket(888);
		Socket s = ss.accept();
		System.out.println("Server  establised to client ");
		
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader brin = new BufferedReader(new InputStreamReader(System.in));

		String str;
		
		while(true)
		{
			while((str = br.readLine()) != null )
			{
				System.out.println(str);
				ps.println(brin.readLine());
			}
				s.close();
				ss.close();
				br.close();
				brin.close();
				System.exit(0);
		}
		
		
	}

}
