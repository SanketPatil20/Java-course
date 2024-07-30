package hashMap;
import java.util.*;
import java.util.Map.Entry;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> sp = new HashMap<>();
		sp.put("MSFT", 100);
		sp.put("GOGL", 50);
		sp.put("BMW", 120);
		sp.put("GE", 30);
		sp.put("NVDA", 80);
		
		//Using for loop
		Set<Entry<String,Integer>> entrySet = sp.entrySet();
		
		for (Entry<String,Integer> entry : entrySet) {
			System.out.println("Company Name: " + entry.getKey()+ " Stock price: "+ entry.getValue());
		}
		
		//Using Iterator
//		Iterator<Entry<String, Integer>> itr = entrySet.iterator(); //Getting the iterator
//
//		while (itr.hasNext()) {
//			Entry<String,Integer> entry = itr.next();
//			System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());
//			
//			if(entry.getKey().equals("Oracle")) {
//				itr.remove();
//			}
//		}
//		System.out.println(sp);
		
		
		//Using for each loop
		sp.forEach((k, v)-> System.out.println("Company name: "+ k+ " Stock price: " + v));
		
	}

}
