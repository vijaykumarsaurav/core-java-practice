package Other;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reverse
{
public void main(String args[]) throws IOException
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter String:");
	String s=br.readLine();
for(int i=s.length()-1;i>1;i--)
{
	System.out.println(s.charAt(i));
}
			
			
}
}
