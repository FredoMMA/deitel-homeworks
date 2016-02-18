package Cap3;

import java.util.Scanner;

public class Ec4_37Factorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 1;
		
		System.out.print("Input a value to do the factorial of it: ");
		int value = input.nextInt();
		
		while(value < 0) {
			
			System.out.println("Negative value. Put a positive value: ");
			value = input.nextInt();
		}
		
		if(value >= 0) {
			
			int number = value;
			
			while(value != 0) {
				
				n = n * value;
				--value;
			}
			
			System.out.printf("The factorial of %d is %d", number, n);
		}
		
		
	}

}
