package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TestTreeSet { 
    public static void main (String args[]) { 
          String phrase = "It was the best of times, it was the worst of times.";  // The phrase 

          // Create a linked hash set 
          Set<String> set = new TreeSet<String>(); 

          // Extract words from the phrase using a StringTokenizer. 
          // The characters that separate words in this phrase are 
          // space, comma and period. 
          StringTokenizer st = new StringTokenizer(phrase, " ,."); 

          // Put each word into the set 
          while (st.hasMoreTokens()) { 
                set.add(st.nextToken()); 
          } 

          // Print out the whole set 
          System.out.println("The set: " + set); 

          // Display the elements in the set using an Iterator 
          System.out.print("The elements:"); 
          Iterator iter = set.iterator(); 
          while (iter.hasNext()) { 
                System.out.print(" " + iter.next()); 
          } 
    } // main 
} // TestTreeSet 