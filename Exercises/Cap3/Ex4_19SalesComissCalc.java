package Cap3;

import java.util.Scanner;

public class Ex4_19SalesComissCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double totalOfItem = 0;
		double total = 0;
		
		System.out.println("Carlos' Items Sold");
		System.out.print("Choose which item was sold (Item 1, 2, 3 or 4) or digit -1 to stop and calculate: ");
		int item = input.nextInt();
		item = checkInvalid(item);
				
		while(item != -1) {
			
			totalOfItem = setQuantityAndAddToTotal(item);
			total += totalOfItem;
			System.out.print("Choose which item was sold (Item 1, 2, 3 or 4) or digit -1 to stop and calculate: ");
			item = input.nextInt();
			item = checkInvalid(item);
						
		}
		
		if(total != 0) {
			
			total = total * 0.09 + 200; 
			System.out.printf("The total that Carlos will receive from the last week is: $%.2f%n", total);
		}
		
		else {
			
			System.out.print("Carlos haven't sold any item, so he'll receive only $200");
		}
		
	} //end main
	
	public static double setQuantityAndAddToTotal(int item) {
		
		Scanner input = new Scanner(System.in);
		
		double totalOfItem = 0;
		double itemValue = 0;
		long quantity = 0;
		
		if(item == 1) {
			
			itemValue = 239.99;
		}
		
		if(item == 2) {
			
			itemValue = 129.75; 
		}
		
		if(item == 3) {
			
			itemValue = 99.95; 
		}
		
		if(item == 4) {
			
			itemValue = 350.89; 
		}
		
		System.out.printf("Set the item %d quantity: ", item);
		quantity = input.nextLong();
		totalOfItem = quantity * itemValue;
		return totalOfItem;
		
	}
	
	public static int checkInvalid(int item) {
		
		Scanner input = new Scanner(System.in);
		
		while(item < -1 || item > 4 || item == 0) {
			
			System.out.println("Invalid valor");
			System.out.print("Choose which item was sold (Item 1, 2, 3 or 4) or digit -1 to stop and calculate: ");
			item = input.nextInt();
		}
		
		return item;
	}
} // end class
