package recursion;

public class Factorial {

	private static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return(n * factorial(n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = factorial(5);
		System.out.println("Factorial of 5 is " +result);

	}

}
