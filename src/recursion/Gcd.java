package recursion;

public class Gcd {
	public static int gcd (int n1, int n2) {
		if (n1==0) {
			return n2;
		}
		else if (n2==0) {
			return n1;
		}
		
		if (n1 > n2) {
			return gcd(n1%n2, n2);
		}
		else {
			return gcd(n1, n2%n1);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 22;
		int y = 55;
		int GCD = gcd(x,y);
		System.out.println("GCD of "+ x+ " and "+ y+ " is "+ GCD);

	}
}

