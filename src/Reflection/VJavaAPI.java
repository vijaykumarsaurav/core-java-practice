package Reflection;
import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VJavaAPI 
{ 

	public static void main(String[] args) throws IOException 
	{
		Class c = null;
		String filename = null;
		try 
		{
			System.out.println("Enter the fully Class/Interface name :");
			String clas = new Scanner(System.in).nextLine();
			c = Class.forName(clas);
			StringTokenizer st = new StringTokenizer(clas,".");
			while(st.hasMoreElements())
			{
				for(int i=0;i<st.countTokens()-1;i++)
					st.nextToken();
			
				filename = st.nextToken();
			
			}
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		/*	Object cl[]= c.getDeclaredClasses();
		for (Object object : cl) {
			System.out.print(object);
		}*/
		System.out.println("\nConstructors :\n============= ");
		//	Constructor cons[] =  c.getConstructors(); //only public constructor show 
		Constructor cons[] = c.getDeclaredConstructors();
	/*	System.out.println("Acess Specifier\t\tConstructor Name\n========================================");
		String con = cons[i].toString();
		String sp[] = con.split(" ");
		for (String string : sp) {
			System.out.print(string+"\t\t\t");
		}
		System.out.println();
	*/
		//System.out.println("\n".codePointAt(0));
		OutputStreamWriter fout = new FileWriter(filename+".doc");
		fout.write("\n\t\t\t\t\t "+filename+" \n\n");	
		fout.write("\nConstructors :\n============= \n");
			
		for (int i=0;i<cons.length;i++)    
		{
			System.out.println((i+1)+". "+cons[i]+"\n");	
			String str = cons[i].toString();
			String sb = i+". " + str +"\n\n\n";
			fout.write(sb);
		}
		System.out.println("\nMethods : \n===========");		
	/*	System.out.println("Acess Specifier\t\t\t Acesss Modifier\t\t\tReturn Type\t\t\tMethod Name");
		String con = md[i].toString();
		String sp[] = con.split(" ");
		for (String string : sp) {
			System.out.print(string+"\t\t\t");
		}
		*/
		
	
		//		Method md[] =  c.getMethods(); //only public method and all object methods 
		Method md[] =  c.getDeclaredMethods();
		fout.write("\nMethods :\n============= \n");
		
		for (int i=0;i<md.length;i++) 
		{
			System.out.println((i+1)+". "+md[i]+"\n");
			String str = md[i].toString();
			String sb = i+". " + str +"\n\n\n";
			fout.write(sb);
		}
		
		
		System.out.println("\nFields : \n===========");
		fout.write("\nFields :\n============= \n");
		Field fld[] = c.getDeclaredFields();
		for (int i=0;i<fld.length;i++) 
		{
			System.out.println((i+1)+". "+fld[i]+"\n");
			String str = fld[i].toString();
			String sb = i+". " + str +"\n\n\n";
			fout.write(sb);
		}
		fout.close();
		
		
	/*	Runtime r= Runtime.getRuntime();
		try {
			r.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}

}
