package hashMap;
import java.util.*;

public class HashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Integer> sp = new HashMap<>();
		sp.put("MSFT", 110);
		sp.put("TSLA", 410);
		sp.put("GOGL", 180);
		sp.put("ELLY", 90);
		sp.put("NVDA", 115);
		
		System.out.println(sp);
		
		//CONTAINS ELLY
		System.out.println(sp.containsKey("ELLY"));
		
		System.out.println(sp.containsKey("HDFC"));
		
		System.out.println(sp.containsValue(180));
		System.out.println(sp.containsValue(100));
		
		//prints all keysets
		System.out.println(sp.keySet());
		
		//prints all values
		System.out.println(sp.values());
		
		//check if hashmap is empty
		System.out.println(sp.isEmpty());
		
		//increase the value of nvda by 1 as its present
		sp.compute("NVDA",(k,v) -> v == null? 10:v +1);
		System.out.println(sp);
		
		//this will add new key with default value given
		sp.compute("INFY",(k,v) -> v == null? 10:v +1);
		System.out.println(sp);
		
		sp.computeIfPresent("INDIA", (k,v) -> v == null ? 10: v+1);
		System.out.println(sp);

	}

}
