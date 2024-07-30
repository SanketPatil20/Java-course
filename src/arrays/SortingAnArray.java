package arrays;
import java.util.*;

public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] num1 = {10,20,23,45,65,34,42,22,44,23};
		
		Arrays.sort(num1);
		
		System.out.println(Arrays.toString(num1));
		
		Integer[] num2 = {10,20,23,45,65,34,42,22,44,23};
		
		System.out.println("Given array is: "+Arrays.toString(num2));
		
		Arrays.sort(num2, 4, 10);
		
		System.out.println(Arrays.toString(num2));
		// taken range from index 4 to 10 as it excludes the last index
		

	}

}
