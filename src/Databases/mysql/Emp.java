package Databases.mysql;

public class Emp {

	int id;
	String name;
	double sal;
	public Emp(int id,String name,double sal)
	{
			this.id = id;
			this.name = name;
			this.sal = sal;
	}
	void display()
	{
		System.out.println("Id :"+this.id+"\t Name :"+this.name+"\t Salay :"+this.sal);
		
	}
	
	
}
