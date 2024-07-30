package arrayList;
import java.util.*;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//5 elements added
		System.out.println(list);
		
		list.add(0,6);
		System.out.println(list);
		//6 added at 0th index
		List list2 = new ArrayList(3);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		// new arraylist created with 3 elements
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
		
		list.addAll(1,list2);
		System.out.println(list);
		// added list 2 at index 1
		
	}

}
