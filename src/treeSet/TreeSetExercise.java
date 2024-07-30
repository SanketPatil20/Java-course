package treeSet;
import java.util.*;
public class TreeSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//converting above array into TreeSet
		
		Integer[] num = {12,23,32,34,54,90,66,57,80,45};
		
		//----------------------------------------------
		//Another way of filling array elements in TreeSet
//		int[] numbers = { 1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56 };
//
//		TreeSet<Integer> set = new TreeSet<>();
//		
//		for(int num : numbers) {
//			set.add(num);
//		}
		//-----------------------------------------------
		
	
		TreeSet<Integer> set = new TreeSet<> (Arrays.asList(num));
		System.out.println(set);
		
		System.out.println("Elements greater than 50: "+ set.tailSet(50));
		
		System.out.println("Smallest element is: "+ set.getFirst());
		System.out.println("Largest element is: "+ set.getLast());
		

	}

}
