package treeMap;
import java.util.*;

public class TreeMapCreateInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Elements will be printed in reverse order	
		
		TreeMap<String, Integer> revMap = new TreeMap<>(Comparator.reverseOrder());
		revMap.put("oracle", 100);
		revMap.put("google", 600);
		revMap.put("msft", 800);
		revMap.put("tesla", 450);
		revMap.put("nvidia", 60);
		System.out.println(revMap);
		
		
		//HashMap will store elements in random order
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("oracle", 100);
		hashMap.put("google", 600);
		hashMap.put("msft", 800);
		hashMap.put("tesla", 450);
		hashMap.put("nvidia", 60);
		System.out.println(hashMap);
		
		//will print in ascending order
		TreeMap <String, Integer> tm1 = new TreeMap<>(hashMap);
		System.out.println(tm1);
	
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("Apple", 43);
		map.put("Novartis", 87);
		
		System.out.println("Initial map: "+map);
		
	    map.putAll(hashMap);
	    System.out.println("Final map with hashmap added: "+map);
	
	}

}
