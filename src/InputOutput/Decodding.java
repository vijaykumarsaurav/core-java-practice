package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.InflaterInputStream;

public class Decodding {

	public static void main(String[] args) {

		FileInputStream fis = null;
		InflaterInputStream ois = null;
		try {
			fis = new FileInputStream("E:\\Eclipse files\\Core\\src\\InputOutput\\incoddedfile.txt");
			System.out.println("File is found ");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		
		try {
			ois= new InflaterInputStream(fis);
			String str = null;
			int te=0;
			while(((te = (int)ois.read()) != -1))
			{
				System.out.println((char)te);
			}
			
			System.out.println("Data distplayed ");
		
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			
			if(ois != null && fis != null)
			{
				
				try {
					ois.close();
					fis.close();
					
					System.out.println("close successfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		


	}

}
