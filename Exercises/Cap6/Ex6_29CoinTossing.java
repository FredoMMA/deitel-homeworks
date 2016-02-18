package Cap6;

import java.util.Scanner;
import java.security.SecureRandom;

public class Ex6_29CoinTossing {

	public enum Status {HEADS, TAILS};
	
	public static final Scanner input = new Scanner(System.in);
	
	public static final SecureRandom randomNumber = new SecureRandom();
	
	public static void main(String[] args) {
		
		Status side;
		int n = askToToss();
		
		while(n == 0) {
			
			side = tossCoin();
			
			if(side == Status.HEADS) {
				
				System.out.println("The side of the coin is HEADS\n\n");
			}
			
			else {
				
				System.out.println("The side of the coin is TAILS\n\n");
			}
			
			n = askToToss();
		} // end while
	} // end main
	
	public static int askToToss() {
		
		System.out.println("Do you want to toss a coin ?");
		System.out.println("0 - YES");
		System.out.println("Any other number - NO");
		int n = input.nextInt();
		System.out.println();
		return n;
	} // end method askToToss
	
	public static Status tossCoin() {
		
		Status side = Status.HEADS;
		int value = randomNumber.nextInt(2);
		
		if(value == 0) {
			
			side = Status.HEADS;
		}
		
		else {
			
			side = Status.TAILS;
		}
		
		return side;
	} // end method tossCoing
}
