package arrayList;
import java.util.*;

public class fetchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList<>();
		//data type of elements is defined as String
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//elements added in ""
		System.out.println(list);
		
		// element at index 2
		System.out.println(list.get(2));
		
		// size of the array
		System.out.println(list.size());

	}
}