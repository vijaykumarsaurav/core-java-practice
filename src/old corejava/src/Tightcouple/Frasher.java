package Tightcouple;

public class Frasher
{
	void doStudy()
	{
		System.out.println("Hi , man do study ");
	}
	void takeInterview()
	{
		
		System.out.println("Take a lot of interview ");
	}
}
class Exprence
{
	void doStudy()
	{
		System.out.println("Hi , man do study a lot becouse u wnt expercence ");
	}
	void takeInterview()
	{
		
		System.out.println("Take a lot of interview for direct experance  ");
	}
}
class Condidate 
{
	void takeChance()
	{
		//titly couple 
		Frasher f= new Frasher();
		f.doStudy();//create a dependency
		f.takeInterview();////create a dependency
		Exprence e = new Exprence();
		e.doStudy();
		e.takeInterview();
	}
}
