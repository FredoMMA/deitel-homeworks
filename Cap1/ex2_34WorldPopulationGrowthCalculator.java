/* ex2_34WorldPopulationGrowthCalculator.java
 * World Population Growth Calculator
 * Author: Carlos Humberto de Paula Borges
 * Date: 09/04/2015
 * Hour: 20:09
 */

package Cap1;

import java.util.Scanner;

public class ex2_34WorldPopulationGrowthCalculator 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double currentWorldPopulation;
		double annualWorldPopulationGR;
		double oneYear, twoYears, threeYears, fourYears, fiveYears;
		
		System.out.println("World Population Growth Calculator");
		System.out.print("Insert the current world population: ");
		currentWorldPopulation = input.nextDouble();
		
		System.out.print("Insert the annual world population growth rate (in %): ");
		annualWorldPopulationGR = input.nextDouble();
		
		oneYear = ((annualWorldPopulationGR / 100) * currentWorldPopulation) + currentWorldPopulation;
		twoYears = ((annualWorldPopulationGR / 100) * oneYear) + oneYear;
		threeYears = ((annualWorldPopulationGR / 100) * twoYears) + twoYears;
		fourYears = ((annualWorldPopulationGR / 100) * threeYears) + threeYears;
		fiveYears = ((annualWorldPopulationGR / 100) * fourYears) + fourYears;
		
		System.out.printf("The estimated world population%nAfter one year: %f%nAfter two years: %f%nAfter three years: %f%nAfter four years: %f%nAfter five years: %f%n", oneYear, twoYears, threeYears, fourYears, fiveYears);
		
	}
}
