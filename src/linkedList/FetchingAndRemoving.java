package linkedList;
import java.util.*;

public class FetchingAndRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> list = new LinkedList<>();
//      At start use LinkedList,not List as some operations 
//		only work with LinkedList
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		
		System.out.println("first element: " + list.getFirst());
		System.out.println("last element: " +list.getLast());
		System.out.println("element at index 5: " +list.get(5));
		
		list.removeFirst();
		System.out.println("1st element removed " + list);
		list.removeLast();
		System.out.println("last element removed " + list);
		list.remove(2);
		System.out.println("index 2 element removed " + list);
		
		list.add(5);
		list.add(2);
		list.add(6);
		System.out.println("Three new elements added: "+list);
		
		list.remove(Integer.valueOf(2));
		System.out.println("Removes first occurance of 2: "+list);
		
		list.removeLastOccurrence(Integer.valueOf(5));
		System.out.println("Removes last occurrence of 5: "+list);
		
		//Make use of Integer.valueOf() instead of new Integer()
		
		Collections.sort(list);
		System.out.println("Sorted list: "+list);
		//sorted list
	}

}
