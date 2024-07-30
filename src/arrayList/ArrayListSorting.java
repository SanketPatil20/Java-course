package arrayList;
import java.util.*;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(30);
		list1.add(50);
		list1.add(10);
		list1.add(40);
		list1.add(20);
		System.out.println("ArrayList1: "+ list1);
		
		List <Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(32);
		list2.add(45);
		list2.add(64);
		list2.add(182);
		System.out.println("ArrayList2: "+list2);
		
		//sorting an array in ascending order
		Collections.sort(list1);
		System.out.println("ArrayList1 in ascending order: "+ list1);
		
		//sorting an array in descending order
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println("Arraylist2 in descending order: " + list2);
		
		//sorting using streams
//		List<Integer> sortedList = list2.stream().sorted().collect(Collectors.toList());
//		System.out.println("ArrayList in asc order: " + sortedList);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
