package Cap6;

import java.util.Scanner;

public class Ex6_10RoundingNumbers {

	public static void main(String[] args) {
		
		double x = 0;
		double y = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Rounding Numbers");
		System.out.println("Choose how you will round your number: ");
		System.out.println("1 - Round to Integer");
		System.out.println("2 - Round to Tenths");
		System.out.println("3 - Round to Hundredths");
		System.out.println("4 - Round to Thousandths");
		
		int z = input.nextInt();
		
		while(z < 1 || z > 4) {
			
			System.out.println("Wrong option. Choose a correct option");
			System.out.println("Choose how you will round your number: ");
			System.out.println("1 - Round to Integer");
			System.out.println("2 - Round to Tenths");
			System.out.println("3 - Round to Hundredths");
			System.out.println("4 - Round to Thousandths");
			
			z = input.nextInt();
		}
		
		if(z == 1) {
			
			System.out.print("Insert the value: ");
			x = input.nextDouble();
			y = roundToInteger(x);
		}
		
		if(z == 2) {
			
			System.out.print("Insert the value: ");
			x = input.nextDouble();
			y = roundToTenths(x);
		}
		
		if(z == 3) {
			
			System.out.print("Insert the value: ");
			x = input.nextDouble();
			y = roundToHundredths(x);
		}
		
		if(z == 4) {
			
			System.out.print("Insert the value: ");
			x = input.nextDouble();
			y = roundToThousandths(x);
		}
		
		System.out.printf("%s%f%n%s%f%n",
				"The original value: ",
				x,
				"The rounded value: ",
				y);
	} // end main
	
	public static int roundToInteger(double number) {
		
		int y = (int) Math.floor(number + 0.5);
		return y;
	} // end roundToInteger
	
	public static double roundToTenths(double number) {
		
		double y = Math.floor(number * 10 + 0.5) / 10;
		return y;
	} // end roundToTenths
	
	public static double roundToHundredths(double number) {
		
		double y = Math.floor(number * 100 + 0.5) / 100;
		return y;
	} // end roundToHundredths
	
	public static double roundToThousandths(double number) {
		
		double y = Math.floor(number * 1000 + 0.5) / 1000;
		return y;
	} // end roundToHundredths
	
} // end class
