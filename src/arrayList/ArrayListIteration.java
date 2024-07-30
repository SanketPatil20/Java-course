package arrayList;
import java.util.*;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		System.out.println(list);
		
		for (int i=0 ; i< list.size(); i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		
		System.out.println();
		
		Iterator <Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		// use of iterator
		
		System.out.println();
		
		//Iteration using forEachRemaining() method
		
		Iterator <Integer> itr2 = list.iterator();
		itr2.forEachRemaining(element -> System.out.println(element)); 
		
		//to remove an element through iteration
		Iterator <Integer> itr3 = list.iterator();
		while (itr3.hasNext()) {
			int next = itr3.next();
			if (next == 30) {
				itr3.remove();
			}
		}
		System.out.println(list);
		// 30 is removed from ArrayList
	}

}
