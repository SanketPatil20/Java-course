package arrays;
import java.util.*;

public class SearchingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		int i = Arrays.binarySearch(num, 10);
		
		System.out.println("Index of number 10 is: " + i);
		
		int index = Arrays.binarySearch(num,  1, 6, 2);
		System.out.println("Index of 2 is: " + index);
		// providing the range
		
		index = Arrays.binarySearch(num,  1,5 ,10);
		System.out.println(index);
		// If the element is not present in the array, 
		// then the index of the first element greater than the key is returned.	

	}

}
