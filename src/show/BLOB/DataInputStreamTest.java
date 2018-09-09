package BLOB;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;

public class DataInputStreamTest 
{

	public static void main(String[] args) 
	{

		DataInputStream dts = new DataInputStream(System.in);
		System.out.println("Enter test &&&&&&&&&&&&&&&&&&&& :");
		char ch = 0 ;
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("D:/dir/test.doc");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(ch != '@' )
		{
			try {
				ch = (char)dts.read();
				fout.write(ch);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Data writen sucessfull");
	}

}
