package Collection;

import java.sql.Date;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
class cl{}
public class DateTest {

	public static void main(String[] args) {
		
		System.out.println("Runnning............");
		
		 LinkedHashSet hashSet = new LinkedHashSet();
		 hashSet.add(new String("Vijay"));
		 hashSet.add(new String("kumar"));
		 hashSet.add(new String("ram"));
		 hashSet.add(new String("Vijay"));
		 hashSet.add(100);
		 hashSet.add(29.90);
		 hashSet.add("viijay");
		 hashSet.add("Vijay");
		 hashSet.addAll(hashSet);
         System.out.println(hashSet);
	 
		 LinkedHashSet h = new LinkedHashSet();
		 h.addAll(hashSet);
		 System.out.println(h);
			System.out.println(h.containsAll(h));
			 h.toArray();

	
		 
		 
		 
		 
		} 
}
