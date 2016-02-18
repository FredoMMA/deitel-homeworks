package Cap6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_33CrapsModification {

	// create secure random number generator for use in method rollDice
		private static final SecureRandom randomNumbers = new SecureRandom();
		
		// enum type with constants that represent the game status
		private enum Status { CONTINUE, WON, LOST };
		
		// constants that represent common rolls of the dice
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;
		
		// play one game of craps
		public static void main (String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			double bankBalance = 1000.0;
			int myPoint = 0; // point if no win or loss on first roll
			Status gameStatus; // can contain CONTINUE, WON or LOST
			
			System.out.println("CRAPS GAME");
			System.out.println("Your bank balance: " + bankBalance);
			System.out.print("Enter a wager: ");
			double wager = input.nextDouble();
			
			while(wager < 0 && wager > bankBalance) {
				
				System.out.print("Reenter a valid wager: ");
				wager = input.nextDouble();
			}
			
			int sumOfDice = rollDice(); // first roll of the dice
			
			// determine game status and point based on first roll
			switch(sumOfDice) {
			
				case SEVEN: // win with 7 on first roll
				case YO_LEVEN: // win with 11 on first roll
					gameStatus = Status.WON;
					bankBalance += wager;
					break;
				case SNAKE_EYES: // lose with 2 on first roll
				case TREY: // lose with 3 on first roll
				case BOX_CARS: // lose with 12 on first roll
					gameStatus = Status.LOST;
					bankBalance -= wager;
					break;
				default: // did not win or lose, so remember point
					gameStatus = Status.CONTINUE; // game is not over
					myPoint = sumOfDice; // remember the point
					System.out.printf("Point is %d%n", myPoint);
					break;
			}
			
			// while game is not complete
			while (gameStatus == Status.CONTINUE) { // not WON or LOST
				
				sumOfDice = rollDice(); // roll dice again
				
				// determine game status
				if (sumOfDice == myPoint) { // win by making point
					
					gameStatus = Status.WON;
					bankBalance += wager;
				}
				
				else {
					
					if(sumOfDice == SEVEN) { // lose by rolling 7 before point
						
						gameStatus = Status.LOST;
						bankBalance -= wager;
					}
				}
			} // end while
			
			// display won or lost message
			if (gameStatus == Status.WON) {
				
				System.out.println("Player Wins");
				System.out.println("Actual bank balance: " + bankBalance);
			}
			
			else {
				
				System.out.println("Player loses");
				System.out.println("Actual bank balance: " + bankBalance);
				
				if(bankBalance == 0) {
					
					System.out.println("Sorry. You busted!");
				}
			}
			
			chatter();
		} // end main
		
		// roll dice, calculate sum and display results
		public static int rollDice() {
			
			// pick random die values
			int die1 = 1 + randomNumbers.nextInt(6); // first die roll
			int die2 = 1 + randomNumbers.nextInt(6); // second die roll
			
			int sum = die1 + die2; // sum of die values
			
			// display results of this roll
			System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
			
			return sum;
		} // end method rollDice
		
		public static void chatter() {
			
			int c = randomNumbers.nextInt(3);
			
			if(c == 0) {
				
				System.out.println("Oh, you're going for broke, huh?");
			}
			
			if(c == 1) {
				
				System.out.println("Aw c'mon, take a chance!");
			}
			
			if(c == 2) {
				
				System.out.println("You're up big. Now's the time to cash in your chips!");
			}
		}
		
} // end class
