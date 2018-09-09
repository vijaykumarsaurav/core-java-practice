package InputOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintWriterTest 
{

	public static void main(String[] args) throws IOException 
	{
		PrintStream ps = new PrintStream(System.out);
		new PrintStream(System.out).println("name ");
		ps.println("printing thow print steam");
		PrintWriter out = new PrintWriter(System.out,true);
		out.println("Output running..............");
		out.append('v');
		out.flush();
		out.checkError();
		out.format("name ran ", " vijay");	
		out.print(2);
		out.print('H');
		out.print(39.333);
		out.println();
		out.toString();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//out.println("Enter int value : ");
	/*	char a = 0;
		do 
		{
			try {
				a =(char) br.read();
				out.print(a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
		}
		while(a != '@'); */
		
		//reading line form keyboard
	/*	String a [] = new String[100];
		int i=0;
		do 
		{
			try {
				a[i] = br.readLine();
				//out.println(a);
				i++;
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		while(!a[i-1].equalsIgnoreCase("stop"));
	
		for (String string : a) {
			System.out.println(string);
			
		}*/
		//int b= 20;
		char b='A';
		System.out.println("Wrinting :");
		System.out.write(b);
		System.out.println(" show");
		
		FileInputStream fin;
		FileOutputStream fout;
		Runtime r= Runtime.getRuntime();
		try {
			r.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i =0;
		try
		{
			fin = new FileInputStream("E:\\Eclipse files\\Core\\src\\InputOutput\\Test.txt");
			fout = new FileOutputStream("E:\\Eclipse files\\Core\\src\\InputOutput\\outfile.txt");
			
			fin.available();
			do 
			{
				i= fin.read();
				fout.write(i);
				if(i != -1)
				{
					if((char)i == '\n')
					System.out.print("\n");
					System.out.print((char)i);
				}
			} while (i != -1);
		} 
		catch (FileNotFoundException e1)
		{
			e1.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("using reader");
		FileReader fd  =  new FileReader("E:/Eclipse files/Core/src/InputOutput/outfile.txt");
		int chh;
		while(true)
		{
		System.out.print((char)fd.read());
			if(fd.read() == -1)
				break;
		}
		
		
	
	}

}
