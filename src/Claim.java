
public class Claim {

	public static String claim(String s) {
		return s + " is mine";
	}

	public static String claim(int n) {
		return "I have " + n;
	}

	public static void main(String[] args){
		String str = claim( 3 + "" );
		System.out.println(str);
	}


}
