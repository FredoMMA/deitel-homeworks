package Cap5;

import java.util.Scanner;

public class Ex5_16BarChart {

	public static void main(String[] args) {
		
		int number;
		int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
		
		Scanner input = new Scanner(System.in);;
		
		System.out.print("Insert five numbers between 1 and 30: ");
		
		for(int counter = 1; counter <= 5; ++counter) {
			
			number = input.nextInt();
			while(number < 1 || number > 30) {
				
				System.out.println("Invalid value");
				System.out.printf("%s%d%s", "Insert ", (6 - counter), " numbers between 1 and 30: ");
				number = input.nextInt();
			}
			
			switch(counter) {
			
				case 1:
					number1 = number;
					break;
				case 2:
					number2 = number;
					break;
				case 3:
					number3 = number;
					break;
				case 4:
					number4 = number;
					break;
				default:
					number5 = number;
					
			} // end switch
		} // end for
		
		countingAsterisks(number1);
		countingAsterisks(number2);
		countingAsterisks(number3);
		countingAsterisks(number4);
		countingAsterisks(number5);
		
	} // end main
	
	public static void countingAsterisks(int number) {
		
		System.out.printf("%s%d%n", "Number ", number);
		for(int counter = 1; counter <= number; ++counter) {
			
			System.out.print('*');
		}
		
		System.out.println();
	} // end static method countingAsterisks
} // end class
