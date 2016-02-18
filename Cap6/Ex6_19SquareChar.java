package Cap6;

import java.util.Scanner;

public class Ex6_19SquareChar {

	public static void main(String[] args) {
		
		int side;
		char fillCharacter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert the type of char: ");
		fillCharacter = input.next().charAt(0);
		
		System.out.print("Insert the number of sides: ");
		side = input.nextInt();
		
		squareOfAsterisks(side, fillCharacter);
	}
	
	public static void squareOfAsterisks(int side, char fillCharacter) {
		
		for(int line = 0; line < side; ++line) {
			
			for(int asterisks = 0; asterisks < side; ++asterisks) {
				
				System.out.print(fillCharacter);
			}
			
			System.out.println();
		}
	}
}
