package Collection;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("ABC");
		v.add("ABC");
		v.add("vij");
		v.add("DEF");
		v.add("GHI");
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.get(2));
		System.out.println(v.indexOf("DEF"));
		System.out.println(v.lastIndexOf("ABC"));
		System.out.println(v.set(2, "six"));
		System.out.println(v.subList(2, 4));
		Object obj[] = new Object[10];
		v.copyInto(obj);
		
		try
		{
		for (Object object : obj)
		{
			System.out.print("\t"+object.toString());
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//v.setSize(60);
	//	System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v);
		
		System.out.println(v);
		
	}

}
