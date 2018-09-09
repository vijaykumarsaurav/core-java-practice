package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet { 
    public static void main (String args[]) { 
       //String phrase = "It was the best of times, it was the worst of times.";   // The phrase 
       
    	Set<String> set = new TreeSet<String>();          // Create the hash set
    	set.add("jug");
    	set.add("you");
    	set.add("Adams");
    	set.add("vijay");
    	set.add("satish");
    	set.add("vijay");
    	set.add("satish");
    	set.add("satish");
    	
    	set.add("vijay");;
    	set.add("Adams");
    	set.add("vijay");
    	set.add("satish");
    	
       // Extract words from the phrase using a StringTokenizer. 
       // The characters that separate words in this phrase are 
       // space, comma and period. 
       //StringTokenizer st = new StringTokenizer(phrase, " ,."); 

       // Put each word into the set 
      /* while (st.hasMoreTokens()) { 
          set.add(st.nextToken()); 
       }*/ 
       // Print out the whole set 
       System.out.println("The set: " + set); 

       // Display the elements in the set using an Iterator 
       System.out.print("The elements:"); 
       Iterator iter = set.iterator(); 
       while (iter.hasNext()) { 
          System.out.print(" " + iter.next()); 
       } 
    } // main 
 } // TestHashSet 
