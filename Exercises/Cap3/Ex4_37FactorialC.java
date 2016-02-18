package Cap3;

import java.util.Scanner;
import java.lang.Math;

public class Ex4_37FactorialC {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double e = 1, n = 1, x = 1;
		int value;
		int value1;
		int number;
		
		System.out.print("Input the number of terms to calculate E: ");
		value = input.nextInt();
		
		System.out.print("Input the value of X: ");
		x = input.nextInt();
		
		while(value < 0) {
			
			System.out.println("Don't insert a negative value");
			System.out.print("Input the number of therms to calculate E: ");
			value = input.nextInt();
		}
		
		while(x < 0) {
			
			System.out.println("Don't insert a negative value");
			System.out.print("Input the value of X");
			x = input.nextInt();
		}
		
		if(value >= 0 && x >= 0) {
			
			number = value;
			
			while(value != 0) {
				
				value1 = value;
				
				while(value1 != 0) {
					
					n *= (double) value1;
					--value1;
				}
				
				e += (Math.pow(x,(double) value) / (double) n);
				--value;
				n = 1;
			}
			
			System.out.printf("The result of the formula for E with %d terms is %.4f ", number, e);
		}
	}

}
