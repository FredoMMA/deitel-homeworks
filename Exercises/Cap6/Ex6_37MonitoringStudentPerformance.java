package Cap6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_37MonitoringStudentPerformance {

	public static final Scanner input = new Scanner(System.in);
	
	public static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int result;
		int countCorrect = 0;
		int countWrong = 0;
		int countAnswers = 0;
		int chatter = 0;
		int work = 1;
		
		while(work == 1) {
			
			do {
				
				a = randomNumbers.nextInt(10);
				b = randomNumbers.nextInt(10);
				
				result = multiplication(a, b);
				
				if(result == a * b) {
					
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
					
					++countCorrect;
				}
				
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
					
					++countWrong;
				}
				
				++countAnswers;
			
			} while(countAnswers < 10);
			
			System.out.println("The number of correct answers is: " + countCorrect);
			System.out.println("The number of wrong answers is: " + countWrong);
			
			if(countCorrect < 8) {
				
				System.out.println("Please ask your teacher for extra help.");
			}
			
			else {
				
				System.out.println("Congratulations, you are ready to go to the next level!");
			}
			
			countCorrect = 0;
			countWrong = 0;
			countAnswers = 0;
		}
	}
	
	public static int multiplication(int a, int b) {
		
		int result = -1;
		
		System.out.print("How much is " + a + " times " + b +"? ");
		result = input.nextInt();
			
		return result;
	}
}
