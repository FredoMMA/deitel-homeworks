package Cap6;

import java.util.Scanner;

public class Ex6_22TemperatureConversions {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int option;
		double celsius;
		double fahrenheit;
		
		System.out.println("What type of temperature do you want to enter?");
		System.out.println("1 - Celsius");
		System.out.println("2 - Fahrenheit");
		
		option = input.nextInt();
		
		while(option != 1 && option != 2) {
			
			System.out.println("INVALID OPTION");
			System.out.println("What type of temperature do you want to enter?");
			System.out.println("1 - Celsius");
			System.out.println("2 - Fahrenheit");
			
			option = input.nextInt();
		}
		
		if(option == 1) {
			
			System.out.print("Insert the temperature in Celsius to convert to Fahrenheit: ");
			celsius = input.nextDouble();
			
			fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("%nThe temperature in Fahrenheit: %.1f%nThe old temperature in Celsius: %.1f%n%n", fahrenheit, celsius);
		}
		
		if(option == 2) {
			
			System.out.print("Insert the temperature in Fahrenheit to convert to Celsius: ");
			fahrenheit = input.nextDouble();
			
			celsius = fahrenheitToCelsius(fahrenheit);
			System.out.printf("%nThe temperature in Celsius: %.1f%nThe old temperature in Fahrenheit: %.1f%n%n", celsius, fahrenheit);
		}
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return celsius;
		
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
	}
}
