package hashMap;
import java.util.*;

public class UpdationAndRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Integer> stock = new HashMap<>();
		
		stock.put("Oracle", 10);
		stock.put("HDFCBNK", 40);
		stock.put("HUL", 50);
		stock.put("NESTLE", 100);
		stock.put("BAJAJ", 50);
		
		System.out.println("Stocks are: " +stock);
		
		System.out.println("Value of HUL is: "+stock.get("HUL"));
		System.out.println("Tesla in stocks: "+stock.get("TSLA"));
		
		System.out.println("This will print the default value of TSLA: "+stock.getOrDefault("TSLA", 100));
		
		stock.replace("BAJAJ", 10, 40);
		// WILL NOT REPLACE THE VALUE AS CURRENT VALUE IS NOT 10
		
		stock.replace("BAJAJ", 50, 40);
		System.out.println("Stocks with changed value in bajaj: " +stock);
		
		stock.replace("BAJAJ", 140);
		System.out.println(stock.get("BAJAJ"));
		
		// stocks with values increased by 10: 
		stock.replaceAll((k,v) -> v+10);
		System.out.println(stock);
		
		//removing oracle
		System.out.println(stock.remove("Oracle"));
		System.out.println(stock);
		
		//google is not present hence null
		System.out.println(stock.remove("Google"));
		
		//passed value doesnt match, hence null
		System.out.println(stock.remove("HUL",160));
		
		System.out.println(stock);

	}

}
