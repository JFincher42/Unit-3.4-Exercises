
public class Sums {

	public static int sum(int n1, int n2) {
		// 2 params
		System.out.println("Sum with 2 params: " + n1 + ", " + n2);
		return n1 + n2;
	}

	public static int sum(int n1, int n2, int n3) { 
		// 3 params
		System.out.println("Sum with 3 params: " + n1 + ", " + n2 + ", " + n3);
		return sum( sum(n1, n2), n3 );  // Call 2 args, twice
										// equivalent to: return n1 + n2 + n3;
	}

	public static void main(String[] args) {
		System.out.println( sum(1, 2) );
		System.out.println( sum(1, 2, 3) );
		//System.out.println( sum(1, 2, 3, 4) );
	}

}
