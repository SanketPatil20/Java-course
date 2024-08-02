package collectionsClass;
import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(50);
		list.add(10);
		
		System.out.println("Max element is: " + Collections.max(list));
		System.out.println("Min element is: " + Collections.min(list));
		System.out.println("Frequency of 10 in list is: " + Collections.frequency(list,10));
		

		
	}

}
