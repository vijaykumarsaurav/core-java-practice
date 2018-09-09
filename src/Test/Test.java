package Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		String str = "hello";
		Object obj = str;
		List<String> listStrings = new ArrayList<String>();
	//	List<Object> listObjects = listStrings;
	//	listObjects.add(7);
		String str1 = listStrings.get(0); 
		


	}
	void printCollection(Collection<? extends Object> col) {
		for(Object obj : col) {
			System.out.println(obj);
		}
	}
	
	void printCollection1(Collection<?> col) {
		for(Object obj : col) {
			System.out.println(obj);
		}
	}


}
class GenericSerializer<T extends Serializable>
{

}

 class Foo<T extends Comparable<T> & Iterable<T>> {

}
 interface Map<K,V> {
	
		void putAll(Map<? extends K, ? extends V> map) ;
	
	}

