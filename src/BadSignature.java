
public class BadSignature {

	public static int foo(int x) {
		return 2 * x;
	}
	
	public static double foo(int y) {
		return 2.0 * y;
	}
	
	public static void main(String[] args) {
		foo(4);		// Which one do I call?
	}

}
