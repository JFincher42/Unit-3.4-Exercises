import java.util.Scanner;

public class Pixxa {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price = 0.0;
		
		System.out.print("Size? (S/M/L) " );
		String size = keyboard.nextLine();
		if (size.equals("s")) {
			price += 5.0;
		}
		else if (size.equals("m")) {
			price += 10.0;
		}
		else if (size.equals("l")) {
			price += 15.0;
		} 
		else {
			System.out.println("Invalid selection, defaulting to medium.");
			price += 10.0;
		}
		
		// Now get some toppings
		System.out.print("Do you want pepperoni for $1.00? (y/n) ");
		String answer = keyboard.nextLine();
		if (answer.equals("y")) {
			price += 1.0;
		}

		System.out.print("Do you want mushrooms for $1.00? (y/n) ");
		answer = keyboard.nextLine();
		if (answer.equals("y")) {
			price += 1.0;
		}

		System.out.print("Do you want anchovies for $1,000,000.00? (y/n) ");
		answer = keyboard.nextLine();
		if (answer.equals("y")) {
			price += 1000000.0;
		}

		// Now print their total
		System.out.println("Your pizza will cost $" + price);
		keyboard.close();
	}
}
