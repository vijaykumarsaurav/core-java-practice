package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class IncodingTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DeflaterOutputStream ios = null;	
		try {
			fos = new FileOutputStream("E:\\Eclipse files\\Core\\src\\InputOutput\\incoddedfile.txt");
			System.out.println("File is created ");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 

		try {
			ios= new DeflaterOutputStream(fos);
			char str =0;
			for (int i = 0; i < 200; i++) {
				ios.write((char)i);
			//	fos.write('\t');
			} 
		//	fos.write(10);fos.write(20);fos.write(30);fos.write(40);fos.write(50);
	//		System.out.println("enter age : ");
	/*		while (str != '@') 
			{
				//oos.writeObject(new Employee("vijay",25));
				System.out.println("comming inside loop ");
		//		str = (char)new Scanner(System.in).nextByte();
				fos.write(25);
			}

*/

			System.out.println("Data is inserted ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{

			if(ios != null && fos != null)
			{

				try {
					ios.close();
					fos.close();
					
					System.out.println("close successfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}



	}
}
