package Threadtotal;

import java.io.*;
import java.net.*;

public class Client 
{

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s  = new Socket("localhost",999);
		
		//accept data form server
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str;
		while((str = br.readLine()) != null )
		{
			System.out.println(str);
		}
		br.close();
		s.close();
	}
	

}
