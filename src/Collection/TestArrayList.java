package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList { 
    final static int SIZE = 5; 
    public static void main(String args[]) { 
          // Create an array list with a particular size 
          ArrayList<Integer> arrayList = new ArrayList<Integer>(SIZE); 
          for (int i=10; i>0; i--) {   // Add elements from 10 to 1 
                arrayList.add(i); 
          } 
          System.out.println("Array list: " + arrayList); 
          System.out.print("The elements in reverse order:"); 
          ListIterator iter = arrayList.listIterator(arrayList.size()); 
          while (iter.hasPrevious()) { 
                System.out.print(" " + iter.previous()); 
          } 
          System.out.println(); 
          System.out.println("Size: " + arrayList.size()); 
          System.out.println("Contains 5? " + arrayList.contains(5)); 
          System.out.println("Contains 20? " + arrayList.contains(20)); 
          System.out.println("Index of 2: " + arrayList.indexOf(2)); 
          arrayList.remove(3); 
          System.out.println("Remove index 3: " + arrayList); 
          ArrayList<Integer> newArrayList = new ArrayList<Integer>(); 
          newArrayList.add(20); 
          newArrayList.add(21); 
          newArrayList.add(22); 
          arrayList.addAll(4, newArrayList); 
          System.out.println("Adding new array list: " + newArrayList + " at index 4: " + arrayList); 
    } // main 
} // TestArrayList 