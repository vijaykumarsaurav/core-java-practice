package Networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s  = new Socket("localhost",888);
		
		//accept data form server
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		while((str = kb.readLine()).equalsIgnoreCase("exit"))
		{
			dos.writeBytes(str);
			System.out.println(br.readLine());
		}
			
		dos.close();
		br.close();
		s.close();
		kb.close();
		
	
	}

}
