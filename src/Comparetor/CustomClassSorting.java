package Comparetor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
public class CustomClassSorting {

	public static void main(String[] args) {

			ArrayList al = new ArrayList();
	
		al.add(new Emp("vijay kumar",25));
		al.add(new Emp("Mehul kumar",24));
		al.add(new Emp("raj kumar",23));
		al.add(new Emp("shown kumar",21));
		al.add(new Emp("ram kumar",22));
		al.add(new Emp("ram kumar",22));	

		System.out.println("Name wise sorted :");
		Collections.sort((List)al, new NameWise());
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Emp type = (Emp) it.next();
			type.display();
			
		}


		System.out.println("\n\\nAge wise sorted :");
		Collections.sort((List)al, new AgeWise());
		for (Object object : al)
		{
			Emp e =  (Emp)object;
			System.out.println(e.name +" " +e.age);
		}
	}

}

class NameWise implements Comparator
{
	public int compare(Object o1,Object o2) 
	{
		Emp e1 =  (Emp)o1;
		Emp e2 =  (Emp)o2; 
		return e1.name.compareTo(e2.name);
	}
}

class AgeWise implements Comparator
{
	@Override
	public int compare(Object o1,Object o2) 
	{
		Emp e1 =  (Emp)o1;
		Emp e2 =  (Emp)o2; 
		if (e1.age == e2.age)
			return 0;
		else if(e1.age > e2.age)
			return -1;
		else 
			return 1;
	}	
}

class Emp
{
	String name ;
	int age;
	public Emp(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Name : "+name +"Age : "+age);
	}
	@Override
	public String toString() {
		return "Nm :"+ name + "ag :"+age;
	} 
	@Override
	public boolean equals(Object ob) {
		Emp e =  (Emp)ob;
		if(e.name ==  e.name)
			return true;
		else 
			return false;
	}
	@Override
	public int hashCode() {
		return 123;
	}
}