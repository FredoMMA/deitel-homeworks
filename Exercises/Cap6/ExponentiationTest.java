package Cap6;

import java.util.Scanner;

public class ExponentiationTest {

	public static void main(String[] args) {
		
		int base;
		int exponential;
		int result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert the base: ");
		base = input.nextInt();
		
		System.out.print("Insert the exponential: ");
		exponential = input.nextInt();
		
		while(exponential < 1) {
			
			System.out.print("Invalid value (Negative or Zero), insert a correct positive integer for exponential: ");
			exponential = input.nextInt();
			
		}
		
		result = Exponentiation.integerPower(base, exponential);
		
		System.out.printf("The result of the exponentiation is %d", result);
	}
}
