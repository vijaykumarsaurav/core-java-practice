package Other;

import java.io.IOException;
import java.util.Date;

public class OpenOther {

	public static void main(String[] args) throws InterruptedException {

		Runtime r = Runtime.getRuntime();
		System.out.println("===================System properties======================");
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.arch"));
		System.out.println(System.getProperty("line.separator"));
		System.out.println(System.getProperty("java.vm.version"));
		System.out.println(System.getProperty("java.vm.vendor"));
		System.out.println(System.getProperty("java.vm.specification.version"));
		System.out.println(System.getProperty("java.vm.specification.vendor"));
		System.out.println(System.getProperty("java.vm.specification.name"));
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("java.specification.vendor"));
		System.out.println(System.getProperty("java.specification.name"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println(System.getProperty("java.io.tmpdir"));
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println(System.getProperty("java.compiler"));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("file.separator"));
		
		
		
		
		System.out.println("======================================================");
		System.out.println(new Date());
		System.out.println(System.currentTimeMillis());
		System.out.println("Total Memories : "+r.totalMemory());
		System.out.println("Memory free :"+r.freeMemory());
		System.gc();
		System.out.println("afer gc() Memory free :"+r.freeMemory());
		int arr[] = new int[100000];	
		for (int i = 0; i < 100000; i++) {
				arr[i]= i;
			}
		System.out.println("Total Memories : "+r.totalMemory());
		System.out.println("Memory free :"+r.freeMemory());
		System.gc();
		System.out.println("afer gc() Memory free :"+r.freeMemory());
		
		System.exit(0);
		try
		{
			Process p = r.exec("notepad");
			System.out.println("exit value : "+p.exitValue());
			p.destroy();
			System.out.println("output");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
