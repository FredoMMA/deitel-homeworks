package Cap6;

import java.util.Scanner;

public class Ex6_23FindTheMinimum {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		float smallest;
		
		System.out.println("The smallest number");
		System.out.print("Insert the first number: ");
		a = input.nextFloat();
		
		System.out.print("Insert the second number: ");
		b = input.nextFloat();
		
		System.out.print("Insert the third number: ");
		c = input.nextFloat();
		
		smallest = minimum3(a, b, c);
		
		System.out.printf("%nThe smallest number of the three inserted is: %f%n", smallest);
	} // end main
	
	public static float minimum3(float a, float b, float c) {
		
		float smallest = Math.min(a, b);
		smallest = Math.min(smallest, c);
		return smallest;
	}
} // end class
