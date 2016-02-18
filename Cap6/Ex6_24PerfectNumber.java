package Cap6;

import java.util.Scanner;

public class Ex6_24PerfectNumber {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Insert the number that you want to verify if it's a Perfect Number or not: ");
		int number = input.nextInt();
		
		boolean result = isPerfect(number);
		
		System.out.printf("%nThe number %d is perfect: %b%n%n", number, result);
		
		for(int n = 1; n <= 1000000000; ++n) {
			
			result = isPerfect(n);
			
			if(result == true) {
				
				System.out.printf("%nThe number %d is perfect: %b%n%n", n, result);
			}
		}
	} // end main
	
	public static boolean isPerfect(int number) {
		
		int sum = 0;
		boolean result = false;
		
		for(int counter = 1; counter < number; ++counter) {
			
			if(number % counter == 0) {
				
				sum += counter;
			}
		}
		
		if(sum == number) {
			
			result = true;
			sum = 1;
			System.out.print("Factors: " + sum);
			for(int counter = 2; counter < number; ++counter) {
				
				if(number % counter == 0) {
					
					sum += counter;
					System.out.print(" + " + counter);
					
				}
			}
		}
		return result;
	} // end method isPerfect
} // end class
