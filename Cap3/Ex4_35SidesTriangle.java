package Cap3;

import java.util.Scanner;

public class Ex4_35SidesTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Input the first number: ");
		a = input.nextInt();
		
		System.out.print("\nInput the second number: ");
		b = input.nextInt();
		
		System.out.print("\nInput the third number: ");
		c = input.nextInt();
		
		if(a + b > c && a + c > b && b + c > a) {
			
			System.out.println("The given values can represent the sides of a triangle");
		}
		
		else {
			
			System.out.println("Those sides can't represent a trangle");
		}
	}
}


