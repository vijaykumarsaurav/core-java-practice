package StringReverse;

public class StaticBlock extends SuperClass
{

	{ 
		super.s="vijay kumar";
		s = "mehul kumar";
		int a=10;
		int b=40;
		sum = a+b;
		System.out.println("minas : "+sum);
	
	}
	static
	{
		System.out.println("static block");
		
	}
	void display ()
	{
		System.out.println(s+sum);
	}
	public static void main(String[] args)
	{	
		new StaticBlock();
		System.out.println("main method ");
		
	}
	
	{ 
		super.s="vijay kumar";
		s = "mehul kumar";
		int a=10;
		int b=40;
		sum = a+b;
		System.out.println("sum : "+sum);
	
	}
	
	
	

}
