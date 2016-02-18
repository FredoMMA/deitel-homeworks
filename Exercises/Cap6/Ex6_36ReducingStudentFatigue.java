package Cap6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_36ReducingStudentFatigue {

	public static final Scanner input = new Scanner(System.in);
	
	public static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int result;
		
		do {
			
			a = randomNumbers.nextInt(10);
			b = randomNumbers.nextInt(10);
			
			result = multiplication(a, b);
			
		} while(result == a * b);
	}
	
	public static int multiplication(int a, int b) {
		
		int result = -1;
		int chatter = 0;
		
		while(result != a * b) {
			
			System.out.print("How much is " + a + " times " + b +"? ");
			result = input.nextInt();
			
			if(result != a * b) {
			
				chatter = randomNumbers.nextInt(4);
				
				switch(chatter) {
				
					case 0:
						System.out.println("No. Please try again.");
						break;
					case 1:
						System.out.println("Wrong. Try once more.");
						break;
					case 2:
						System.out.println("Don't give up!");
						break;
					default:
						System.out.println("No. Keep trying.");
				}
				
			}
		}
		
		chatter = randomNumbers.nextInt(4);
		
		switch(chatter) {
		
			case 0:
				System.out.println("Very good!");
				break;
			case 1:
				System.out.println("Excellent!");
				break;
			case 2:
				System.out.println("Nice work!");
				break;
			default:
				System.out.println("Keep up the good work!");
		}
		
		return result;
	}
}
