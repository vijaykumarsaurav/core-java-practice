package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectRetrive {


	public static void main(String[] args) {


		ObjectInputStream ois= null; 
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\Eclipse files\\Core\\src\\InputOutput\\fos.txt");
			System.out.println("File is found ");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		
		try {
			ois= new ObjectInputStream(fis);
			String str = null;
		for (int i = 0; i < 10; i++) {
			Employee e  = (Employee)ois.readObject();
			e.display();
		
		}
			
			System.out.println("Data is inserted ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		finally
		{
			
			if(ois != null && fis != null)
			{
				
				try {
					fis.close();
					ois.close();
					System.out.println("close successfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
