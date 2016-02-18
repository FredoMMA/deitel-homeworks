package Cap5;

import java.util.Scanner;

public class Ex5_17CalculatingSales {

	public static void main(String[] args) {
		
		int productNumber;
		int quantitySold = 0;
		double value = 0;
		double total = 0;
		int counter = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", 
				"Choose which product you want to buy: ",
				"Product 1: $2.98",
				"Product 2: $4.50", 
				"Product 3: $9.98",
				"Product 4: $4.49",
				"Product 5: $6.87",
				"Press <Ctrl> + Z to stop buying");
		
		while(input.hasNext()) {
			
			productNumber = input.nextInt();
			
			switch(productNumber) {
			
				case 1:
					value = 2.98;
					break;
				case 2:
					value = 4.50;
					break;
				case 3:
					value = 9.98;
					break;
				case 4:
					value = 4.49;
					break;
				case 5:
					value = 6.87;
					break;
				default:
					System.out.println("Invalid value");
					value = 0;
					break;
			} // end switch
			
			total += value;
			++counter;
		} // end while
		
		System.out.printf("%n%s%d%s%,.2f$",
				"The total value of ",
				counter,
				" items sold is: ",
				total);
	} // end main
} // end class
