package InputOutput;
import java.io.File;
import java.util.Scanner;

public class AllFileSearch 
{
	public static void main(String[] args)
	{
        	System.out.println("Enter the full path of source  : ");
			String s = new Scanner(System.in).nextLine();  //"../Core/src/InputOutput/Help.txt"
			
			File fi = new File(s);
			String url = null;
			File []file = fi.listFiles();
			for (File file2 : file) 
			{
				System.out.println(file2);
				String s1 = file2.getAbsolutePath();
				System.out.println(s1);
				
				String sp[] = s1.split("/");
				System.out.println(sp.length);
				
				for (String string : sp) 
				{
					System.out.println(string);
				/*	url +=  string;
					File gf = new File(url,string);
					String tl[]=gf.list();
					for (String string2 : tl) 
					{
						System.out.println(string2);
						url += "/";
					}
					url = "";	*/				
				}
			}
	}

}
