package Threadtotal.Chat;

public class Test {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		//Thread.currentThread();
		t.setName("vijay");
		System.out.println(t);
	}
}
