package arrayList;
import java.util.*;

public class UsingListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		
		//getting ListIterator
		ListIterator<Integer> lite = list.listIterator();
		
		//traversing elements from start
		System.out.println("Iterating forward: ");
		while (lite.hasNext()) {
			System.out.println("Next element is " + lite.next() + 
					" and index is " + lite.nextIndex());
		}
		
		//traversing elements from end
		System.out.println("Iterating from backward: ");
		while (lite.hasPrevious()) {
			System.out.println("Previous element is : " + lite.previous() + 
					" and previous index is " + lite.previousIndex());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
