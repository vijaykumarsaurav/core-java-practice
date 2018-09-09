package Other;

public class StaticInsideStatic 
{
	
	static 
	{
		//static  //error static inside the static can run
		{
			System.out.println("static block");
			
		}
	}
	
	
	
	public static void main(String[] args) {

		System.out.println("Main");
		new StaticInsideStatic();
	}
	
	{
		{
		System.out.println("simple block");
	
		}
	}
}
