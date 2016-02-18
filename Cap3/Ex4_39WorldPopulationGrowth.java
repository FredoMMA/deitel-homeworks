package Cap3;

import java.util.Scanner;

public class Ex4_39WorldPopulationGrowth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double growthRate;
		double currentYear;
		double currentWorldPopulation;
		double newYear;
		int count = 1;
		int count2 = 1;
		double numericalIncrease;
		double antecipatedWorldPopulation;
		double doubleYear = 0;
		double doubleYearPopulation = 0;
		
		System.out.println("World Population Growth in 75 years\n");
		System.out.print("Insert the  growth rate (in %): ");
		growthRate = input.nextDouble();
		
		System.out.print("Insert the current year: ");
		currentYear = input.nextDouble();
		
		System.out.print("Insert the current world population: ");
		currentWorldPopulation = input.nextDouble();
		
		while(growthRate < 0) {
			
			System.out.println("Invalid value of growth rate");
			System.out.print("Insert the  growth rate (in %): ");
			growthRate = input.nextDouble();
		}
		
		antecipatedWorldPopulation = currentWorldPopulation;
		newYear = currentYear;
		
		while(count <= 75) {
			
			++newYear;
			
			antecipatedWorldPopulation += (antecipatedWorldPopulation * (growthRate / 100));
			
			numericalIncrease = antecipatedWorldPopulation * (growthRate / 100);
			
			if(count == 1) {
				
				System.out.println("Year				World Population				Numerical Increase of the Year");
			}
			
			System.out.printf("%.0f				%.0f					%.0f%n", newYear, antecipatedWorldPopulation, numericalIncrease);
			
			if(antecipatedWorldPopulation >= (currentWorldPopulation * 2) && count2 == 1) {
				
				doubleYear = newYear;
				doubleYearPopulation = antecipatedWorldPopulation;
				count2 = 2;
			}
			
			++count;
		}
		
		System.out.printf("%nThe year %.0f has the double of the population from year %.0f%n", doubleYear, currentYear);
		System.out.printf("%.0f = %.0f%n", currentYear, currentWorldPopulation);
		System.out.printf("%.0f = %.0f%n", doubleYear, doubleYearPopulation);
		
	}
	
}
