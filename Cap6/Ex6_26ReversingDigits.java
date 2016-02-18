package Cap6;

import java.util.Scanner;

public class Ex6_26ReversingDigits {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Insert a number: ");
		int number = input.nextInt();
		
		number = reversingDigits(number);
		
		System.out.println("\nTesting: "+ number);
	} // end main
	
	public static int reversingDigits(int number) {
		
		int only = 0;
		int newN = 0;
		int counter = 0; // not used for the occasion, but may be necessary for a future reversal to the old value
		
		while(number >= 10) {
			
			only = number % 10;
			
			if(number >= 10) {
				
				number /= 10;
			}
			
			System.out.print(only);
			
			if(number < 10) {
				
				if(only != 0) {
					
					newN = (only + newN) * 10;
				}
				
				else {
					
					newN *= 10;
				}
				
				only = number;
				System.out.print(only);
				
				if(only != 0) {
					
					newN += only;
				}
				
				else {
					
					newN *= 10;
				}
			}
			
			if(only != 0 && number >= 10) {
				
				newN = (only + newN) * 10;
			}
			
			if(only == 0 && number >= 10) {
				
				newN *= 10;
			}
			
			++counter;
		}
		
		return newN;
	}
}// end class
