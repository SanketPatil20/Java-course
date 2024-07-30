package arrays;
import java.util.*;

public class CopyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int[] newArray = Arrays.copyOf(num, num.length);
		
		System.out.println("copied array is: ");
		for(int i : newArray) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		int[] newArray1 = Arrays.copyOf(num, 15);
		
		//array with bigger size
		
		System.out.println("copied bigger array is: ");
		for(int i : newArray1) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		// for printing only the range in array
		
		int[] newArray3 = Arrays.copyOfRange(num, 0,5);
		
		System.out.println("copied array is: ");
		for(int i : newArray3) {
			System.out.print(i + " ");
		}
		
	}

}
