
public class Grouch {

	public static void grouch(int x) {
		System.out.println("I love trash!");
	}

	public static void grouch(double x) {
		System.out.println("Get off my lawn!");
	}

	public static void main(String[] args){
		grouch( Math.max(4, (int) Math.pow(1, 1.5)) );
	}

}
