package Cap5;

import java.util.Scanner;

public class Ex5_33FacebookUserBaswGrowth {

	public static void main(String[] args) {
		
		double initialAmount = 1000000000;
		double amountUsers = initialAmount;
		double rate = 0.04;
		int monthsFirstHalf = 0;
		int monthsDoubleValue = 0;
		int mark = 1; // Mark used to make the condition statement (IF) not be used again in the other loops, after it be executed once
		
		System.out.println("Facebook User Base Growth");
		
		for(int months = 1; amountUsers <= 2000000000; ++months ) {
			
			amountUsers = initialAmount * Math.pow(1.0 + rate, months);
			
			if(amountUsers >= (initialAmount + (initialAmount / 2)) && mark == 1) {
				
				monthsFirstHalf = months;
				++mark;
			}
			
			if(amountUsers >= initialAmount * 2 && mark == 2) {
				
				monthsDoubleValue = months;
				++mark;
			}
		}
		
		System.out.println();
		System.out.printf("%s%,.0f%s%d%s%n",
				"The amount of ", 
				initialAmount + initialAmount / 2, 
				" will be reached by number of ",
				monthsFirstHalf,
				" months");
		
		System.out.printf("%s%,.0f%s%d%s%n",
				"The amount of ", 
				initialAmount * 2, 
				" will be reached by number of ",
				monthsDoubleValue,
				" months");
	}
}
