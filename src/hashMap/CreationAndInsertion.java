package hashMap;
import java.util.*;

public class CreationAndInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> stock = new HashMap<>();
		stock.put("Oracle", 350);
		stock.put("Google", 680);
		
		System.out.println("Stock  is: "+stock);
		
		// updating oracle  share price
		stock.put("Oracle", 111);
		System.out.println(stock);
		
		//Already present hence not updated
		stock.putIfAbsent("Oracle", 222);
		System.out.println(stock);
		
		Map<String, Integer> stock1 = new HashMap<>();
		stock1.put("Tesla", 505);
		stock1.put("Nvidia", 350);
		stock1.put("MSFT", 150);
		System.out.println("Stock 1  is: "+stock1);
		
		// Both combined
		stock.putAll(stock1);
		System.out.println(stock);
		
		
	}

}
