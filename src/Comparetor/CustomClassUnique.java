package Comparetor;

import java.util.HashSet;
import java.util.Iterator;

public class CustomClassUnique {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(new Employee("vijay",21));
		hs.add(new Employee("kehso",25));
		hs.add(new Employee("sidarth",22));
		hs.add(new Employee("sidarth",22));
		hs.add(new Employee("sidarth",50));
		hs.add(new Employee("sid",50));
		
		System.out.println("Name wise sorted :");
//		Collections.sort((List)al, new NameWise());
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Employee e = (Employee)it.next();
			e.display();
		}

	}

}
class Employee
{
	String name ;
	int age;
	public Employee(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public Employee(Object next) {
		// TODO Auto-generated constructor stub
	}
	void display()
	{
		System.out.println("Name : "+name +"Age : "+age);
	}
	@Override
	public int hashCode() {
		return 123;
	}
	@Override
	public boolean equals(Object arg0) {
		Employee e = (Employee)arg0;
		if(e.age == this.age && e.name == e.name)
		return true;
		else 
			return false;
	}
}