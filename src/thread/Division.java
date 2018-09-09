package thread;

import java.util.Scanner;

public class Division {

	public void Division1() {
		System.out.println("Division Operation ");
		System.out.print("Enter the 2 Value : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Division Result : "+(a/b));
	}

}
