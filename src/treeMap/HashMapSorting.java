package treeMap;
import java.util.*;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// USING TreeMap
		Map<Integer,String> emp = new HashMap<>();
		emp.put(106, "Alex");
		emp.put(172, "Ryan");
		emp.put(103, "Joe");
		emp.put(180, "Allen");
		emp.put(145, "Roy");
		
		System.out.println(emp);
		
		Map<Integer, String> sortMap = new TreeMap<>();
		sortMap.putAll(emp);
		System.out.println("Sorted Map: "+ sortMap);
		

		// Using ArrayList
		Map<Integer,String> emp1 = new HashMap<>();
		emp1.put(176, "John");
		emp1.put(182, "Rock");
		emp1.put(143, "Jason");
		emp1.put(110, "Alex");
		emp1.put(105, "Rey");
		
		System.out.println(emp1);
		
		List<Integer> keyList = new ArrayList<>(emp1.keySet());
		Collections.sort(keyList);
		System.out.println(keyList);
		
		List<String> ValList = new ArrayList<>(emp1.values());
		Collections.sort(ValList);
		System.out.println(ValList);
		
		System.out.println("Sorting by key: ");
		emp1.entrySet()
		.stream()
		.sorted(Map.Entry.<Integer, String>comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("Sorting by value: ");
		emp1.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}

}

