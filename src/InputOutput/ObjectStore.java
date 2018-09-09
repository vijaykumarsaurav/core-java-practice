package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectStore {

	public static void main(String[] args) 
	{
		ObjectOutputStream oos= null; 
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:\\Eclipse files\\Core\\src\\InputOutput\\fos.txt");
			System.out.println("File is created ");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		
		try {
			oos= new ObjectOutputStream(fos);
			String str = null;
			System.out.println("enter name and age : ");

			while (str != "ok") 
			{
			//oos.writeObject(new Employee("vijay",25));
				System.out.println("comming inside loop ");
				str =  new Scanner(System.in).nextLine();
				int age =new Scanner(System.in).nextInt();
				oos.writeObject(new Employee(str,age));
			}
	
				
			
			System.out.println("Data is inserted ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			
			if(oos != null && fos != null)
			{
				
				try {
					fos.close();
					oos.close();
					System.out.println("close successfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
