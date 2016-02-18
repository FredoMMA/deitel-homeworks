package Cap6;

import java.util.Scanner;

public class Ex6_18Square {

	public static void main(String[] args) {
		
		int side;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert the number of sides: ");
		side = input.nextInt();
		
		squareOfAsterisks(side);
	}
	
	public static void squareOfAsterisks(int side) {
		
		for(int line = 0; line < side; ++line) {
			
			for(int asterisks = 0; asterisks < side; ++asterisks) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
