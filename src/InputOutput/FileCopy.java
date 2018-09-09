package InputOutput;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {


		FileReader fis = null;
		FileWriter fout = null;
		//FileReader fis =  null;
		//FileWriter fout= null;
		try {
			System.out.println("Enter the full path of source  : ");
			fis = new  FileReader(new Scanner(System.in).nextLine());  //"../Core/src/InputOutput/Help.txt"
			System.out.println("Enter the full path of destination  : ");
			fout =  new FileWriter(new Scanner(System.in).nextLine());  //"../Core/src/InputOutput/outhelp.txt"
			byte b =0;
			while(b != -1)
			{
				b=(byte) fis.read();
				fout.write(b);
			}		
			
			System.out.println("Sucessfully done ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}

}
