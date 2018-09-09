package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList { 
    final static int SIZE = 5; 
    public static void main(String args[]) { 
          // Create a linked list 
          LinkedList<Integer> linkedList = new LinkedList<Integer>(); 

          // Add elements from 10 to 1 
          for (int i=10; i>0; i--) { 
                linkedList.add(i); 
          } 

          System.out.println("Linked list: " + linkedList); 
          System.out.println("getFirst: " + linkedList.getFirst()); 
          System.out.println("getLast: " + linkedList.getLast()); 
          linkedList.addFirst(11); 
          System.out.println("addFirst 11: " + linkedList); 
          linkedList.addLast(0); 
          System.out.println("addLast 0: " + linkedList); 
          linkedList.add(3, 100); 
          System.out.println("add(3, 100): " + linkedList); 

          System.out.print("The list in reverse order: "); 
          ListIterator iter = linkedList.listIterator( 
                linkedList.size()); 
          while (iter.hasPrevious()) { 
                System.out.print(" " + iter.previous()); 
          } 
    } // main 
} // TestLinkedList 