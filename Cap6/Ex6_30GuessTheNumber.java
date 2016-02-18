package Cap6;

import java.util.Scanner;
import java.security.SecureRandom;

public class Ex6_30GuessTheNumber {

	public static final Scanner input = new Scanner(System.in);
	
	public static final SecureRandom randomNumber = new SecureRandom();
	
	public static void main(String[] args) {
		
		int option = 1;
		System.out.println("GUESS THE NUMBER");
		
		while(option == 1) {
			
			System.out.print("Try to guess the integer between 1 and 1000: ");
			int n = input.nextInt();
			guessTheNumber(n);
			System.out.println("Do you want to play again? \n 1 - YES \n Any other number - NO");
			option = input.nextInt();
		}
	} // end main
	
	public static void guessTheNumber(int n) {
		
		int guessNumber = 1 + randomNumber.nextInt(1000);
		
		while (n != guessNumber) {
			
			if(n > guessNumber) {
				
				System.out.print("Too high, try again: ");
				n = input.nextInt();
			}
			
			if(n < guessNumber) {
				
				System.out.print("Too low, try again: ");
				n = input.nextInt();
			}
		} // end while
		
		System.out.println("Congratulations. You guessed the number!\n");
	} // end method
} // end class
