package corejava;
import java.io.*;
import java.sql.Wrapper;
public class ReturnMain {

	public static void main(String[] args)throws IOException 
	{

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.print("Enter the String :");
		String s1 = new String(br.readLine());
		System.out.println(s1);
		int des = Integer.parseInt(br.readLine());
		
		System.out.println(Float.parseFloat(br.readLine()));
		System.out.println(Double.parseDouble(br.readLine()));
		System.out.println(Long.parseLong(br.readLine()));
		String s="kkk";
		System.out.println(s.valueOf(0));
		
	
		
		
		
	}

}
