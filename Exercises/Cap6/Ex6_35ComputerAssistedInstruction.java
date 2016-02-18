package Cap6;

import java.util.Scanner;

import java.security.SecureRandom;

public class Ex6_35ComputerAssistedInstruction {

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
		
		while(result != a * b) {
			
			System.out.print("How much is " + a + " times " + b +"? ");
			result = input.nextInt();
			
			if(result != a * b) {
			
				System.out.println("No. Please try again.");
			}
		}
		
		System.out.println("Very good!");
		return result;
	}
}
