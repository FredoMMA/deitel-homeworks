package Cap6;

import java.util.Scanner;

public class Ex6_16Multiples {

	public static void main(String[] args) {
		
		int first;
		int second;
		boolean result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert the first number: ");
		first = input.nextInt();
		
		System.out.print("Insert the second number: ");
		second = input.nextInt();
		
		result = isMultiple(first, second);
		
		System.out.printf("The %d is multiple of %d: %b ", second, first, result);
	}
	
	public static boolean isMultiple(int first, int second) {
		
		boolean result;
		if(second % first == 0) {
			
			result = true;
		}
		
		else {
			
			result = false;
		}
		
		return result;
	}
}
