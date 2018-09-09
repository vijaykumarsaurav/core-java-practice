package Collection;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) 
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.clear();
		ht.put("A", "abc");
		ht.put("b", "bbb");
		ht.put("c", "ccc");
		ht.put("Aa", "abcd");
		ht.put("", "");
		ht.put("", "");
		ht.put("", "");
		System.out.println(ht);
		System.out.println(ht.contains("abc")); 
		System.out.println(ht.containsKey("a")); 
		System.out.println(ht.containsValue("ccc")); 
		System.out.println(ht.get("b")); 
		System.out.println(ht.isEmpty()); 
		System.out.println(ht.elements()); 
		System.out.println(ht.size()); 
		System.out.println(ht.toString()); 
		System.out.println(ht.entrySet()); 
		System.out.println(ht.keySet()); 
		System.out.println(ht.values()); 
		ht.putAll(ht); 
		System.out.println(ht.size()); 
		System.out.println(ht); 
		Hashtable<Comparable, String> table=new Hashtable<Comparable, String>();
		table.put("abc", "v1");
		table.put(100, "x1");
		table.put(10.09, "tree");
		table.put(11, "tree");		
		table.put(12, "tree");
		table.put(13, "tree");
		table.put(13, "vijay");
		table.put(1, "vijay");
		table.put(2, "vijay");
		
		System.out.println(table);
		

	
	
	}

}
