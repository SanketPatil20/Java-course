package treeSet;
import java.util.*;

public class TreeSetCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Integer> set = new TreeSet<>();
		set.add(21);
		set.add(32);
		set.add(43);
		set.add(56);
		set.add(67);
		System.out.println(set);
		
		//treeSet to store elements in reverse order
		TreeSet <Integer> reverse = new TreeSet<> (Comparator.reverseOrder());
		reverse.add(23);
		reverse.add(54);
		reverse.add(11);
		reverse.add(34);
		reverse.add(98);
		
		System.out.println("TreeSet in reverse order is: "+ reverse);

	}

}
