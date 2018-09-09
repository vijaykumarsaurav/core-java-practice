package InputOutput;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class ExtensitonWiseSearch {

	public static void main(String[] args) throws IOException {

		String dirname = "../Core/src/InputOutput";  //C:\\Users\\Vijay\\Desktop
		File f1 = new File(dirname);
		//	FilenameFilter only = new GiveOnlyExt("txt");
		//		String s[]  =  f1.list(only);
		File s[]  =  f1.listFiles();

		for (File file : s) 
		{	
			String string1= file.toString();
			if(string1.endsWith(".lnk"))
			System.out.println(string1);
			
			System.out.println(file.separatorChar);
			File fr[] =  file.listRoots();
			for (File file2 : fr) {
				System.out.println(file2.toString());
			}
			if (file.isDirectory())
			{


			//		System.out.println(file+" is directory");
			//		System.out.println(file.getAbsolutePath());
			//		System.out.println(file.getAbsoluteFile());
			File  fl  =	file.getAbsoluteFile();
			if(fl.isDirectory())
			{
				System.out.println(file+" is directory");


			}


			//	fl.isDirectory();
		}
		{
			//	System.out.println(file.toString());
			//		if(file.delete())
			//	System.out.println(string +" Deleted");

		}

		}
		System.out.println("ok done");
	}

}
class GiveOnlyExt implements FilenameFilter
{
	String s;
	public  GiveOnlyExt(String ext)
	{
		this.s = "."+ext;
	}
	public boolean accept(File dir,String name)
	{
		return name.endsWith(s);
	}

}