package Cap3;

import java.util.Scanner;

public class Ex4_17GasMileage {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double milesPerGallon = 0;
		int totalMilesDriven = 0;
		int totalGallonsUsed = 0;
		int tripCount = 0;
		int gallonsUsed = 0;
		
		System.out.print("Input the miles driven of the trip OR -1 to quit the program: ");
		int milesDriven = input.nextInt();
		System.out.println("");
		milesDriven = verifyInvalidMiles(milesDriven);
		
		if(milesDriven != -1) {
			System.out.print("Input the gallons used of the trip OR -1 to quit the program: ");
			gallonsUsed = input.nextInt();
			System.out.println("");
			gallonsUsed = verifyInvalidGallons(gallonsUsed);
		}
		
		while(milesDriven != -1 && gallonsUsed != -1) {
			
			milesPerGallon = (double) milesDriven / gallonsUsed;
			++tripCount;
			totalMilesDriven += milesDriven;
			totalGallonsUsed += gallonsUsed;
			System.out.printf("The miles per gallon of the trip %d is: %.1f%n", tripCount, milesPerGallon);
			
			System.out.print("Input the miles driven of the trip OR -1 to quit the program: ");
			milesDriven = input.nextInt();
			System.out.println("");
			milesDriven = verifyInvalidMiles(milesDriven);
			
			if(milesDriven != -1) {
				System.out.print("Input the gallons used of the trip OR -1 to quit the program: ");
				gallonsUsed = input.nextInt();
				System.out.println("");
				gallonsUsed = verifyInvalidGallons(gallonsUsed);
			}
			
		}
				
		if(tripCount != 0) {
			
			double totalMilesPerGallon = (double) totalMilesDriven / totalGallonsUsed;
			
			System.out.printf("The total of miles per gallon for all the %d trips together, is: %.1f%n", tripCount, totalMilesPerGallon);
		}
		
		else {
			
			System.out.println("No trip values (Miles and Gallons) were input");
		}
	} //end main
	
	public static int verifyInvalidMiles(int milesDriven) {
		
		Scanner input = new Scanner(System.in);
		
		while(milesDriven == 0 || milesDriven < -1) {
			
			System.out.printf("%d is not a valid number%n", milesDriven);
			System.out.print("Input the miles driven of the trip OR -1 to quit the program: ");
			milesDriven = input.nextInt();
			System.out.println("");
		}
		
		return milesDriven;
	} //end verifyInvalidMiles
	
	public static int verifyInvalidGallons(int gallonsUsed) {
		
		Scanner input = new Scanner(System.in);
		
		while(gallonsUsed == 0 || gallonsUsed < -1) {
			
			System.out.printf("%d is not a valid number%n", gallonsUsed);
			System.out.print("Input the gallons used of the trip OR -1 to quit the program: ");
			gallonsUsed = input.nextInt();
			System.out.println("");
		}
		
		return gallonsUsed;
	} //end verifyInvalidGallons
} //end class
