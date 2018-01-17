
public class IdentifyTheType {
	
	public static void identifyTheType(int x) {
		System.out.println(x + " is an integer.");
	}
	
	public static void identifyTheType(String str) {
		System.out.println("\"" + str + "\" is a string");
	}

	public static void main(String[] args) {
		identifyTheType("Hello");
		identifyTheType(8);
	}

}
