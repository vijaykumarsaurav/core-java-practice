package InputOutput;

import java.io.Serializable;

public class Employee implements Serializable{
	
	String name;
	int age;
	public Employee( String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Name : "+this.name+"Age "+this.age);		
	}
}
