package Test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name and age + 10  :");
		String str = sc.nextLine();
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,".");
		while(st.hasMoreElements())
		{
			System.out.println("Name : "+st.nextToken()+ "    AGE :"+(Integer.parseInt(st.nextToken())));
		}


	}

}
