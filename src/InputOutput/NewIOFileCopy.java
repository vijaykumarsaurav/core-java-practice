package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class NewIOFileCopy {

	public static void main(String[] args) 
	{

		FileInputStream fin ; 
		FileOutputStream fout ;
		FileChannel fIchan,fOchan; 
		long fsize;
		MappedByteBuffer mBuf;
		
		try {
			System.out.println("Enter the full path of source  : ");
			fin = new FileInputStream(new Scanner(System.in).nextLine());
			System.out.println("Enter the full path of destination  : ");
			fout = new FileOutputStream(new Scanner(System.in).nextLine());
			
			fIchan = fin.getChannel();
			fOchan = fout.getChannel();
			
			fsize = fIchan.size();
			
			mBuf = fIchan.map(FileChannel.MapMode.READ_ONLY, 0, fsize);
			
			long ms = fOchan.write(mBuf);
			System.out.println("Copy sucessfully done  time taken :"+ms);
			
			
			fIchan.close();
			fin.close();
			fOchan.close();
			fout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Copy not done ");
			
			System.out.println(e);
			System.exit(1);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Uses copy from to : "+e);
			System.exit(1);
		}
		
	}

}
