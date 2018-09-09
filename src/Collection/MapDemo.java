package Collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapDemo { 
	static TreeMap<String, Integer> treeMap;
	public static void displayMapEntries(Map map) { 
         Set entrySet = map.entrySet();     // Get an entry set for the map 
         java.util.Iterator iter = entrySet.iterator(); // Get an iterator and loop over the map 
         while (iter.hasNext()) { 
               System.out.println("\t" + iter.next()); 
         } 
    } 
    
    public static void main(String args[]) { 
          HashMap<String, Integer> hashMap = new HashMap<String, Integer>(); 
         System.out.println("Adding entries in this order:"); 
         System.out.println("\tcg1=35");                       System.out.println("\tcs2s=15"); 
         System.out.println("\tcs2=45");                       System.out.println("\tcs4=49"); 
          hashMap.put("cg1", 35);                               hashMap.put("cs2s", 15); 
          hashMap.put("cs2", 45);                               hashMap.put("cs4", 49); 
         System.out.println("Contents of hash map: ");          displayMapEntries(hashMap); 
          LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(); 
          linkedHashMap.put("cg1", 35);                           linkedHashMap.put("cs2s", 15); 
          linkedHashMap.put("cs2", 45);                           linkedHashMap.put("cs4", 49); 
         System.out.println("Contents of linked hash map: ");     displayMapEntries(linkedHashMap); 
         treeMap = new TreeMap<String, Integer>(); 
         treeMap.put("cg1", 35); 
         treeMap.put("cs2s", 15); 
         treeMap.put("cs2", 45); 
         treeMap.put("cs4", 49); 
      
         System.out.println("Contents of tree map: ");              displayMapEntries(treeMap); 
         System.out.println(treeMap.values());
         System.out.println(treeMap.keySet());
         
    }
    // main 
} // MapDemo 
