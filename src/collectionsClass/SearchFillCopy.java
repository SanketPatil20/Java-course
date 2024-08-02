package collectionsClass;
import java.util.*;

public class SearchFillCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(80);
		list.add(70);
		list.add(30);
		list.add(40);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println("Index of 30 is: " + Collections.binarySearch(list,Integer.valueOf(30)));
		
		Collections.sort(list);
		System.out.println("List in ascending order: "+list);
		
//		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedList);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("ArrayList in desc order: "+ list);
				
	}

}
