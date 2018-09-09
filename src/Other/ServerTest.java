package Other;

import java.io.*;
import java.net.*;

public class ServerTest
{

	public static void main(String[] args) throws IOException
	{
		
			ServerSocket	ss = new ServerSocket(777);
			Socket s = ss.accept();
			System.out.println("Server  establised to client ");
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader brin = new BufferedReader(new InputStreamReader(System.in));

			String str;
			ps.println("this connected to server");
			while(true)
			{	
				while((str = br.readLine()) != null )
				{
					System.out.println(str);
					ps.println(brin.readLine());
				}
				
				ss.close();
				br.close();
				brin.close();				
				System.exit(0);
			
			}
								
			
		}

	}


