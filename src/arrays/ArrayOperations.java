package arrays;
import java.util.*;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// converting array into a list
		Integer [] num = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(num);
		
		System.out.println(list);
		
		//changing resulting list
		list.set(1,20);
		
		System.out.println("Updated list is: " + list);
		
		System.out.println("Updated array is: " + Arrays.toString(num));
		
		//--------------------------------------------------
		
		//checking if two arrays are equal
		
		Integer[] num1 = {1,2,3,4,5,6,7,8,9,10};
		Integer[] num2 = {1,2,3,4,5,6,7,8,9,10};
		
		boolean isEqual = Arrays.equals(num1,num2);
		
		System.out.println("Checking if arrays are equal: " + isEqual);
		
		//------------------------------------------------------
		
		// filling default values in array
		
		Integer[] numFill = {1,2,3,4,5,6,3,5,7,9};
		Arrays.fill(numFill, 10);
		
		System.out.println("Array with 10 as default value filled: "+Arrays.toString(numFill));
	}

}
