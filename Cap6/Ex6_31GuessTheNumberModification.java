package Cap6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_31GuessTheNumberModification {

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
		int tryNumber = 0;
		
		while (n != guessNumber) {
			
			if(n > guessNumber) {
				
				System.out.print("Too high, try again: ");
				n = input.nextInt();
			}
			
			if(n < guessNumber) {
				
				System.out.print("Too low, try again: ");
				n = input.nextInt();
			}
			++tryNumber;
		} // end while
		
		System.out.println("Congratulations. You guessed the number!");
		
		if(tryNumber >= 0 && tryNumber < 10) {
			
			System.out.println("Either you know the secret or you got lucky! \n");
		}
		
		if(tryNumber == 10) {
			
			System.out.println("Aha! You know the secret! \n");
		}
		
		else {
			
			System.out.println("You should be able to do better! \n");
		}
	} // end method
}
