package collectionsClass;
import java.util.*;

public class SearchFillCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println("Index of 30 is: " + Collections.binarySearch(list,Integer.valueOf(30)));
		
		Collections.sort(list);
		System.out.println("List in ascending order: "+list);
		
		
		
				
	}

}
