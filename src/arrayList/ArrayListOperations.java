package arrayList;
import java.util.*;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		System.out.println(list);

		list.remove(7);
		System.out.println(list);
		// removed element @index 7
		
		list.remove(new String("g"));
		System.out.println(list);
		// removed "g"
		
//		list.clear();
//		System.out.println(list);
		//removes all elements from the ArrayList
		
		list.replaceAll((element) -> element.toUpperCase());
		System.out.println(list);
		//replacing all elements with their upper cases
		
		list.set(5,"B");
		System.out.println(list);
		//setting index 5 to B
		
		String ele = "A";
		if(list.contains(ele)) {
		System.out.println("A is present in ArrayList");
		}
		else {
			System.out.println("A is not present in ArrayList");
		}
		//finding if list contains element
		
		System.out.println(list.indexOf("B"));
		//finding first index of the element
		
		System.out.println(list.lastIndexOf("B"));
		// finding last index of the element
		
		
	}
}
