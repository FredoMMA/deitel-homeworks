/* (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
	hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
	hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
	longer than 24 hours at a time. Write an application that calculates and displays the parking charges
	for each customer who parked in the garage yesterday. You should enter the hours parked for each
	customer. The program should display the charge for the current customer and should calculate and
	display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
	the charge for each customer.
 */

package Cap6;

import java.util.Scanner;

public class Ex6_8ParkingCharges {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int counter = 1;
		double charges;
		double totalCharges = 0.0;
		
		System.out.println("Parking Charges Calculator from Yesterday");
		System.out.print("Insert the amount of hours for the client number "+ counter +" or -1 to Quit: ");
		
		int hours = input.nextInt();
		hours = checkCorrectHours(hours, counter);
		
		while(hours != -1) { //pg. 166 Deitel
			
			charges = calculateCharges(hours);
			
			System.out.printf("The total charges of the client %d is: %.2f%n%n", counter, charges);
			
			totalCharges += charges;
			++counter;
			
			System.out.print("Insert the amount of hours for the client number "+ counter +" or -1 to Quit: ");
			
			hours = input.nextInt();
			hours = checkCorrectHours(hours, counter);
			
		} // end while
		
		System.out.printf("%n%nThe total amount of charges from yesterday is: %.2f", totalCharges);
	} // end main
	
	public static int checkCorrectHours(int hours, int counter) {
		
		
		while(hours < -1 || hours > 24) {
			
			if(hours < -1){
				
				System.out.println("Error: Cannot insert a negative value.");
			}
			
			if(hours > 24){
				
				System.out.println("Error: It's not acceptable to have more than 24 hours.");
			}
			
			System.out.print("Insert the amount of hours for the client number "+ counter +" or -1 to Quit: ");
			
			hours = input.nextInt();
		}
		
		return hours;
	} // end method checkCorrectHours
	
	public static double calculateCharges(int hours) {
		
		double charges = 2.0;
		if(hours == 0) {
			
			charges = 0.0;
		}
		
		if(hours > 0 && hours < 4) {
			
			charges = 2.0;
		}
		
		if(hours > 3 || hours < 19) {
			
			for(int countCharges = 1; countCharges < hours; ++countCharges) {
				
				charges += 0.5;
			}
		}
		
		else {
			
			charges = 10.0;
		}
		
		return charges;
	}
}
