package corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDuplicate 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String :");
		String s1 = new String(br.readLine());
		System.out.println("Given Input String : "+s1);
	    char ch[]=	StringDuplicate.removeDuplicate(s1);
	    System.out.print("Unique String : ");
	    System.out.println(ch);
	    for(int i=0;ch[i] != '\0'; i++)
	    {
	    	System.out.println(ch[i]+" = "+StringDuplicate.matchCount(s1, ch[i]));
	    }
	}

public static char [] removeDuplicate(String s1)
{
	int count=1;
	boolean confor=false;
	char ch[] = new char[s1.length()];
	ch[0] = s1.charAt(0);
	for(int i=1;i<s1.length();i++)
	{
		for(int j=0;ch[j] != '\0';j++)
		{
			if(ch[j]==s1.charAt(i))
			{	
				confor=true;
				break;
			}
		} 
		if(confor==false)
		{
			ch[count++]=s1.charAt(i);
		}
	confor=false;		
	}
	return ch; 
}
public static int matchCount(String str,char ch)
{
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
		if(ch == str.charAt(i))
			count++;
	}
	return count;
}
}