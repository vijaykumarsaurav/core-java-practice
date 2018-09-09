package Hashset.src.com.rajesh;

import java.util.HashSet;

public class Hs {

	public Hs() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("vijay1");
		hs.add("vijay2");
		hs.add("vijay3");
		hs.add("vijay3");
		hs.add("1vijay3");
		hs.add("2vijay3");
		for(String s : hs)
		{
			System.out.println(s);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Hs();
	}

}
