package classFinerbySmallFrame;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class GetMembers
{
	static String fn;

	static void showAPI(String clas) throws IOException
	{
		Class c = null;
		String filename = null;
		try 
		{
			//			System.out.println("Enter the fully Class/Interface name :");
			//			String clas = new Scanner(System.in).nextLine();
			c = Class.forName(clas);
			StringTokenizer st = new StringTokenizer(clas,".");
			while(st.hasMoreElements())
			{
				for(int i=0;i<st.countTokens()-1;i++)
					st.nextToken();

				filename = st.nextToken();
				fn = filename;
			}
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("\nConstructors :\n============= ");
		Constructor cons[] = c.getDeclaredConstructors();
		OutputStreamWriter fout = null;
		try {
			fout = new FileWriter("E:\\JavaClasses\\"+filename+".doc");
		} catch (IOException e) {
			e.printStackTrace();
		}
		fout.write("\n\t\t\t\t\t "+filename+" \n\n");	
		fout.write("\nConstructors :\n============= \n");

		for (int i=0;i<cons.length;i++)    
		{
			System.out.println((i+1)+". "+cons[i]+"\n");	
			String str = cons[i].toString();
			String sb = (i+1)+". " + str +"\n\n\n";
			fout.write(sb);
		}
		System.out.println("\nMethods : \n===========");		
		Method md[] =  c.getDeclaredMethods();
		fout.write("\nMethods :\n============= \n");

		for (int i=0;i<md.length;i++) 
		{
			System.out.println((i+1)+". "+md[i]+"\n");
			String str = md[i].toString();
			String sb = (i+1)+". " + str +"\n\n\n";
			fout.write(sb);
		}

		System.out.println("\nFields : \n===========");
		fout.write("\nFields :\n============= \n");
		Field fld[] = c.getDeclaredFields();
		for (int i=0;i<fld.length;i++) 
		{
			System.out.println((i+1)+". "+fld[i]+"\n");
			String str = fld[i].toString();
			String sb = (i+1)+". " + str +"\n\n\n";
			fout.write(sb);
		}
		fout.close();
		if(Desktop.isDesktopSupported())
			try {		
				Desktop.getDesktop().open(new File("E:\\JavaClasses\\"+fn+".doc"));
			} catch (IOException e) {
				e.printStackTrace();
			}		

	}


}