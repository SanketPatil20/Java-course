package treeSet;
import java.util.*;

public class FetchAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Integer> set = new TreeSet<>();
		set.add(21);
		set.add(32);
		set.add(25);
		set.add(61);
		set.add(28);
		set.add(90);
		set.add(45);
		set.add(59);
		
		System.out.println(set);
		
		System.out.println("First element is: " + set.first());
		System.out.println("Last element is: " + set.last());
		System.out.println("Fetching elements between 21-30: " + set.subSet(21,30));
		System.out.println("Printing elements less than 50: "+ set.headSet(50));
		System.out.println("Printing elements greater than 50: "+ set.tailSet(50));
		
		//if asked, you can use TreeSet as a data structure to perform all operations 

		System.out.println("Removing 20: "+ set.remove(20));
		System.out.println("Removing 21: "+ set.remove(21));
		//21 removed
		System.out.println(set);
		
		System.out.println("Is given set empty ? " + set.isEmpty());
		System.out.println("Size of the TreeSet is... " + set.size());
		System.out.println("Is set contains 90? "+ set.contains(90));
		
		
		
		
		
	}

}
