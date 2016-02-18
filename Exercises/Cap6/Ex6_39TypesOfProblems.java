package Cap6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_39TypesOfProblems {

	public static final Scanner input = new Scanner(System.in);
	
	public static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int countCorrect = 0;
		int countWrong = 0;
		int chat = 0;
		int work = 1;
		int level = 1;
		int type = 0;
		int type2 = 0;
		double operation;
		double result;
		
		while(type < 1 || type > 5) {
			
			System.out.println("Choose the type of arythmetic problem to study: ");
			System.out.println("1 - Addition");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("5 - Random Operations");
			type = input.nextInt();
		}

		while(work == 1) {
			
			do {
				
				a = randomNumbers.nextInt((int) (Math.pow(10, level)));
				b = randomNumbers.nextInt((int) (Math.pow(10, level)));
				
				type2 = randomTypes(type);
				operation = typeOfOperation(a, b, type2);
				result = questionAndResult(a, b, type2);
				
				if(result == operation) {
					
					chat = 1;
					
					chatter(chat);
					
					++countCorrect;
				}
				
				if(result != operation) {
					
					chat = -1;
					
					chatter(chat);
					
					++countWrong;
				}
				
			} while(countCorrect + countWrong < 10);
			
			System.out.println("The number of correct answers is: " + countCorrect);
			System.out.println("The number of wrong answers is: " + countWrong);
			
			if(countCorrect < 8) {
				
				System.out.println("Please ask your teacher for extra help.");
			}
			
			else {
				
				System.out.println("Congratulations, you are ready to go to the next level!");
				System.out.println();
				++level;
			}
			
			countCorrect = 0;
			countWrong = 0;
			System.out.println("Do you want to keep testing or to quit?");
			System.out.println("(1 - YES, Any other number - NO): ");
			work = input.nextInt();
		}
	}
	
	public static double questionAndResult(int a, int b, int type2) {
		
		double result = 0.0;
		
		if(type2 == 1) {
			
			System.out.print("How much is " + a + " plus " + b +"? ");
			result = input.nextInt();
		}
		
		if(type2 == 2) {
			
			System.out.print("How much is " + a + " minus " + b +"? ");
			result = input.nextInt();
		}
		
		if(type2 == 3) {
			
			System.out.print("How much is " + a + " times " + b +"? ");
			result = input.nextInt();
		}
		
		if(type2 == 4) {
			
			System.out.print("How much is " + a + " divided by " + b +"? ");
			result = input.nextInt();
		}
			
		return result;
	}
	
	public static double typeOfOperation(int a, int b, int type2) {
		
		double operation = 0;
		
		if(type2 == 1) {
			
			operation = a + b;
		}
		
		if(type2 == 2) {
			
			operation = a - b;
		}
		
		if(type2 == 3) {
			
			operation = a * b;
		}
		
		if(type2 == 4) {
			
			operation = a / b;
		}
		
		return operation;
	}
	
	public static int randomTypes(int type) {
		
		int type2;
		
		switch(type) {
		
			case 1: case 2: case 3: case 4:
				type2 = type;
				break;
			default:
				type2 = 1 + randomNumbers.nextInt(4);
		}
		
		return type2;
	}
	
	public static void chatter(int chat) {
		
		if(chat == 1) {
			
			int chatter = randomNumbers.nextInt(4);
			
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
		}
		
		else {
			
			int chatter = randomNumbers.nextInt(4);
			
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
}
