package hashMap;
import java.util.*;
import java.util.Map.Entry;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> sp = new HashMap<>();

		sp.put("Oracle", 56);
		sp.put("Fiserv", 117);
		sp.put("BMW", 73);
		sp.put("Microsoft", 213);
		sp.put("Google", 421);
		sp.put("Ford", 456);
		sp.put("Novartis", 43);
		sp.put("TCS", 23);
		
		int max = 0;
		String comp = "";
		
		for(Entry <String, Integer> entry : sp.entrySet()) {
			if(entry.getValue() > max) {
				comp = entry.getKey();
				max = entry.getValue();
			}
		}
		System.out.println("Maximum stock price: "+comp);
		
		Collection<Integer> values = sp.values();
		int sum = 0;
		for(int i :values) {
			sum = sum+i;
		}
		System.out.println("Avg stock price is: " + sum/values.size());
		
		
		Iterator<Entry<String, Integer>> itr= sp.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			if(entry.getValue() < 50) {
				itr.remove();
			}
		}
		
		System.out.println(sp);
		
	}

}
