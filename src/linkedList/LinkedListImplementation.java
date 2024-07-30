package linkedList;
import java.util.*;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);	
		System.out.println(list);
		//added elements
		
		list.addFirst(101);
		list.addLast(104);
		System.out.println(list);
		//Added elements in first and last position
		
		list.add(4,84);
		System.out.println(list);
		//Added element on given index
		
		LinkedList <Integer> list1 = new LinkedList<>();
		list1.add(54);
		list1.add(64);
		list1.add(74);
		//created another LinkedList
		
		list.addAll(4, list1);
		System.out.println(list);
		//added list1 @ index 4 in list
	}

}
