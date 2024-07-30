package recursion;

public class FindOccurance {

	private static int firstOccurance(int[] a, int n, int currentIndex) {
	if(a.length == currentIndex) {	
		return -1;
	}
	else if (a[currentIndex] == n) {
		return currentIndex;
	}
	else {
		return firstOccurance(a,n, currentIndex + 1);
	}
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,5,4,7,6};
		for (int i=0; i <arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		int n = 5;
		int index = firstOccurance(arr, n, 0);
		System.out.println("Index of the given number is: "+ index);

	}

}
