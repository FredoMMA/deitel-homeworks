package Cap6;

import java.util.Scanner;

public class Ex6_27GreatestCommonDivisor {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Insert the first integer: ");
		int a = input.nextInt();
		
		System.out.print("Insert the second integer: ");
		int b = input.nextInt();
		
		int gcd = greatestCommonDivisor(a, b);
		
		System.out.println("The greatest common divisor between " + a + " and " + b + " is: " + gcd);
	}
	
	public static int greatestCommonDivisor(int a, int b) {
		
		int smallest = Math.min(a, b);
		int biggest = Math.max(a, b);
		int remainder = biggest;
		
		// biggest = (number of multiples of smallest that makes biggest smaller than smallest) * smallest + remainder
		while(remainder != 0) {
			
			remainder = biggest;
			
			while(remainder >= smallest) {
				
				remainder -= smallest;
			}
			
			biggest = smallest;
			smallest = remainder;
		}
		
		return biggest;
	} // end method
} // end main
