package Collection;

import java.util.ListIterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.add("this");
		s.add("vijay");
		s.add("2nd");
		s.add("vijay");
		s.add("vijay");
		s.add(100);
		s.add("vijay");
		s.add("vijay");
		s.add("vijay");
		s.add("vijay");
		s.add("vijay");
		s.add(100);
		s.addElement("ABC");
		Stack ss = new Stack();
		Object obj[] = new Object[5];
		System.out.println(s.capacity());
		System.out.println(s.lastElement());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.search("this"));
		System.out.println(s.push("last"));
		System.out.println(s.size());
		ListIterator ls= s.listIterator();
		while(ls.hasNext())
		{
			System.out.print(ls.next());
		}
		System.out.println();
		System.out.println(s);
	}
}
