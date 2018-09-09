package thread;

import java.util.Scanner;

public class Addition {

	public void  Addition1() {
		System.out.println("Addtion Operation ");
		System.out.print("Enter the 2 Value : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition  Result : "+(a+b));
	}
	

}
