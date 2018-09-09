package Interview;

class Top {
	public Top()
	{
		System.out.print("B");
	}
}
public class Bottom2 extends Top {
	public Bottom2(String s) 
	{ 
		//super("vijay");
		System.out.print("D"); 
	}
	public static void main(String [] args) 
	{
		
		System.out.println(" = ");
		new Bottom2("C");
		
	}
}
