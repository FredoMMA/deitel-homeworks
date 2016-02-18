package Cap6;

import java.util.Scanner;

public class Ex6_28Points {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter the student's average point at the subject: ");
		float average = input.nextFloat();
		
		int n = qualityPoints(average);
		
		System.out.println("The quality point of the average " + average + " is: " + n);
	}
	
	public static int qualityPoints(float average) {
		
		int n = 0;
		
		if(average >= 90 && average <= 100) {
			
			n = 4;
		}
		
		if(average >= 80 && average < 90) {
			
			n = 3;
		}
		
		if(average >= 70 && average < 80) {
			
			n = 2;
		}
		
		if(average >= 60 && average < 70) {
			
			n = 1;
		}
		
		if(average < 60) {
			
			n = 0;
		}
		
		return n;
	}
}
