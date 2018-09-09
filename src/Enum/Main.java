package Enum;
enum Animals {
	DOG("sher"), CAT("meow"), FISH("wheher");
	String sound;
	
	Animals(String s) 
	{
		sound = s;
		//System.out.println("enum cons");
	}
}
	 
public class Main {
	
	static Animals a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}

