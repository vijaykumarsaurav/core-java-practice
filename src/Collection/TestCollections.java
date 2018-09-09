package Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;


public class TestCollections { 
	public static void main(String args[]) { 
		Collection list = (Collection) Collections.nCopies(3, "red");     // Create a list of three strings 
		// Create an array list of three elements 
		ArrayList<String> arrayList = new ArrayList<String>(list); 
		System.out.println("The initial list is: " + arrayList); 
		Collections.fill(arrayList, "yellow"); 
		System.out.println("After filling with yellow: " + arrayList); 
		// Add three new elements to the end of the list 
		arrayList.add("white"); 
		arrayList.add("black"); 
		arrayList.add("orange"); 
		System.out.println("After adding new elements: " + arrayList); 
		// Shuffle the list 
		Collections.shuffle(arrayList); 
		System.out.println("After shuffling: " + arrayList); 
		// Reverse the list 
		Collections.reverse(arrayList); 
		System.out.println("After reversing: " + arrayList); 
		// Find the minimum and maximum elements 
		System.out.println("Minimum element: " + Collections.min(arrayList)); 
		System.out.println("Maximum element: " + Collections.max(arrayList)); 
		// Sort the list 
		Collections.sort(arrayList); 
		System.out.println("After sorting: " + arrayList); 
		// Find an element in the list 
		System.out.println("Binary search for white: " +  Collections.binarySearch(arrayList, "white")); 

		Collection<Person> persons =  new LinkedList<Person>(); 
		persons.add( new Person("Alice") ); 
		persons.add( new Person("vijay") ); 
		
		System.out.println( persons.size() ); 

		Collection<Person> copy = 
				new TreeSet<Person>(); 
		copy.addAll(persons);//new TreeSet(persons) 

		Person[] array = (Person[]) copy.toArray(); 
		System.out.println( array[0].name ); 
		System.out.println( array[0] ); 
		System.out.println( array[1].name ); 


	} // main 
} // TestCollections 
class Person
{
	String name;
	public Person(String j)
	{
		this.name = j;
	}
}