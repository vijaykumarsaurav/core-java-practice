package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMap {

	public static void main(String[] args) {

		FileInputStream fis =  null;
		try {
			fis = new  FileInputStream("../Core/src/InputOutput/Help.txt");
			byte b = 0;
			int lc=0;
			int wc =0;
			int cc=0;
			while(b != -1)
			{
				cc++;
				try {
					b = (byte) fis.read();
					char ch =  (char)b;					
					System.out.print(ch);
					
					if(ch ==  '\n')
					{
						lc++;
					}
					if(ch ==  ' ')
					{
						wc++;
					}
					
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("No. of characters :"+cc);
			System.out.println("No. of words :"+wc);
			System.out.println("No. of line :"+lc);
			System.out.println("No. of char without space  :"+(cc-wc));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
