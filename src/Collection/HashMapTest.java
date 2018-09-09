package Collection;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		
		System.out.println(hm.put("abc", "ABC"));
		System.out.println(hm.put("V", "vijay"));
		
		System.out.println(hm.put("", "withoutnull"));
		System.out.println(hm.put("", "2nd without"));
		
		System.out.println(hm.get("V"));
		
		System.out.println(hm.size());
		System.out.println(hm.containsValue("vijay"));
		System.out.println(hm.containsKey("v"));
		System.out.println(hm.containsKey("V"));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.isEmpty());
		System.out.println(hm.getClass());
		
		
	
	}

}
