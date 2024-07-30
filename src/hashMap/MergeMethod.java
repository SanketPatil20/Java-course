package hashMap;
import java.util.*;

public class MergeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,Integer> map1 = new HashMap<>();
		map1.put("Jay", 1000);
		map1.put("Rahul",5000);
		map1.put("Vijay",9000);
		map1.put("Amol", 600);
		map1.put("Nitin", 3000);
		
		Map <String,Integer> map2 = new HashMap<>();
		map2.put("Jay", 100);
		map2.put("Rahul",500);
		map2.put("Vijay",30);
		map2.put("Amol", 600);
		map2.put("Nitin",1000);
		
		map1.forEach((key,value) -> map2.merge(key,value, (v1,v2)-> v1 + v2)) ;
		System.out.println(map2);

	}

}
