package hashset;
import java.util.*;

public class HashSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> set = new HashSet<>();
		
		int[] data = {10,23,34,45,56,67,78,64,55,23};
		int dup =0; 
		
		for (int i: data) {
			if(!set.add(i)) {
				dup = i;
				break;
			}		
		}
		
		System.out.println(dup);
		
	}
}
