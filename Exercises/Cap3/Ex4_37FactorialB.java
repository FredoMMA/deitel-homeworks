package Cap3;

import java.util.Scanner;

public class Ex4_37FactorialB {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double e = 1, n = 1;
		int value;
		int value1;
		int number;
		
		System.out.print("Input the number of therms to calculate E: ");
		value = input.nextInt();
		
		while(value < 0) {
			
			System.out.println("Don't insert a negative value");
			System.out.print("Input the number of therms to calculate E: ");
			value = input.nextInt();
		}
		
		if(value >= 0) {
			
			number = value;
			
			while(value != 0) {
				
				value1 = value;
				
				while(value1 != 0) {
					
					n *= value1;
					--value1;
				}
				
				e += (1 / (double) n);
				--value;
				n = 1;
			}
			
			System.out.printf("The result of the formula for E with %d terms is %.4f ", number, e);
		}
	}
}
