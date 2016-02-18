package Cap5;

import java.util.Scanner;

public class Ex5_11SmallesValue {
	
	public static void main(String[] args) {
		
		int biggest = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of values: ");
		int quantity = input.nextInt();
		
		for(int counter = 1; counter <= quantity; ++counter) {
			
			System.out.println();
			System.out.print("Input a number: ");
			int value = input.nextInt();
			
			switch(counter) {
			
				case 1:
					biggest = value;
					break;
				default:
					if(value > biggest) {
						
						biggest = value;
					}
					
			} // end switch
		} // end for
		
		System.out.printf("%n%s%d", "The biggest value is: ", biggest);
	} // end main

} // end class
