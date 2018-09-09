package LooselyCouple;

public class Frasher implements Jobable
{
	public void doStudy()
	{
		System.out.println("Hi , man do study ");
	}
	public void takeInterview()
	{
		System.out.println("Take a lot of interview :"+name);
	}
}
class Exprence implements Jobable
{
	public void doStudy()
	{
		System.out.println("Hi , man do study a lot becouse u wnt expercence ");
	}
	public void takeInterview()
	{
		
		System.out.println("Take a lot of interview for direct experance  ");
	}
}
class Condidate 
{
	void takeChance()
	{
		//Loosely couple 
		Jobable f = new Frasher();
		f.doStudy();//create a dependency
		f.takeInterview();////create a dependency
		Jobable e = new Exprence();
		e.doStudy();
		e.takeInterview();
	}
}
