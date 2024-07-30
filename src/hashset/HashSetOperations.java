package hashset;
import java.util.*;

public class HashSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		
		set.add(17);
		set.add(14);
		set.add(20);
		set.add(98);
		set.add(75);
		set.add(54);
		
		System.out.println(set);
		
		set.remove(11);
		System.out.println("Set after removing 11: " + set);
		
		//shows if set is empty
		System.out.println(set.isEmpty());
		
		// Iterating through set
		System.out.println("Using for loop: ");
		for(Integer i: set) {
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("Using iterator: ");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------");
		System.out.println("Using forEach loop: ");
		set.forEach(System.out::println);
		
		// converting set into arraylist for sorting
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		//clearing the whole set
		set.clear();
		System.out.println("Set is now empty: "+set);
		

	}

}
