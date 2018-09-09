package InputOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Date;

public class FileDirTest {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Vijay\\Desktop\\Testd");
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
	//	System.out.println(f.delete());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getPath());
		System.out.println(f.isHidden());
		System.out.println(f.canExecute());
		System.out.println(f.isAbsolute() );
	//	f.deleteOnExit();
		f.createNewFile();
		System.out.println(f.mkdir());
		long l = f.lastModified();
		Date d =  new Date(l);
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		System.out.println(f.length());
		System.out.println(d.getTime());
		System.out.println(f.setExecutable(true));
		System.out.println(f.setReadable(false));
		//System.out.println(f.setReadOnly());
		System.out.println(f.setWritable(false));
		System.out.println("+++++++++++++++++++++To make directory +++++++++++++++++++++++"+f.mkdirs());
		f.createNewFile();
		Path ph = (Path) f.toPath();
		System.out.println("to path");
		for (Path path : ph) {
			System.out.println(path.toString());
		} 
		System.out.println("===========");
		
		String s[] = f.list();
		for (String string : s) {
			System.out.println(string);
		}
		File fl [] = f.listFiles();
		for (File file : fl) {
			if(file.isAbsolute())
			{
				String ss[] =  file.list();
				for (String string : ss) {
					System.out.println(string);
				}
			}
				System.out.println(file.toString()+"Absulate file");
			
			if(file.isDirectory())
				System.out.println(file.toString()+"is Directory");
			else if(file.isFile())
				System.out.println(file.toString()+"is file");
			else 
				System.out.println("Absolute file :"+file.isAbsolute());
		}
		
	}

}
