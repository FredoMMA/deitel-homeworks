/*ex2_33BMICalculator
 * Body Mass Index Calculator
 * Author: Carlos Humberto de Paula Borges
 * Date: 09/04/2015
 * Hour: 1946
 */
package Cap1;

import java.util.Scanner; //Program uses class Scanner

public class ex2_33BMICalculator 
{
	//main method of Java application
	public static void main(String[] args)
	{
		//create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		double weightInKilograms;
		double heightInMeters;
		double bmi;
		
		System.out.println("Body Mass Index Calculator (BMI)"); //Intro
		
		System.out.print("Insert your weight in kilograms: "); //Prompt
		weightInKilograms = input.nextDouble(); //Insert value into weightInKilograms
		
		System.out.print("Insert your height in meters: "); //Prompt
		heightInMeters = input.nextDouble(); //Inserting value into heightInMeters
		
		bmi = (weightInKilograms) / (heightInMeters * heightInMeters);
		
		System.out.printf("Your BMI: %f%n%n", bmi);
		System.out.println("BMI VALUES\nUnderweight:    less than 18.5\nNormal:		between 18.5 and 24.9\nOverweight:     between 25 and 29.9\nObese:		30 or greater");
		
		
	}
}
