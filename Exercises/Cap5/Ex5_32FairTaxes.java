package Cap5;

import java.util.Scanner;

public class Ex5_32FairTaxes {

	public static void main(String[] args) {
		
		// housing, food, clothing, transportation, education, health care, vacations
		double houseExpenses = 0;
		double foodExpenses = 0;
		double clothingExpenses = 0;
		double transportationExpenses = 0;
		double educationExpenses = 0;
		double healthCareExpenses = 0;
		double vacationsExpenses = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Insert your house expenses: ");
		houseExpenses = input.nextDouble();
		
		System.out.printf("Insert your food expenses: ");
		foodExpenses = input.nextDouble();
		
		System.out.printf("Insert your clothing expenses: ");
		clothingExpenses = input.nextDouble();
		
		System.out.printf("Insert your transportation expenses: ");
		transportationExpenses = input.nextDouble();
		
		System.out.printf("Insert your education expenses: ");
		educationExpenses = input.nextDouble();
		
		System.out.printf("Insert your health care expenses: ");
		healthCareExpenses = input.nextDouble();
		
		System.out.printf("Insert your vacations expenses: ");
		vacationsExpenses = input.nextDouble();
		
		printExpensesTaxes(houseExpenses);
		printExpensesTaxes(foodExpenses);
		printExpensesTaxes(clothingExpenses);
		printExpensesTaxes(transportationExpenses);
		printExpensesTaxes(educationExpenses);
		printExpensesTaxes(healthCareExpenses);
		printExpensesTaxes(vacationsExpenses);
		
	}
	
	public static void printExpensesTaxes(double expenses) {
		
		double thirdy = 0;
		double twentyThree = 0;
		int counter = 0;
		String typeExpenses;
		
		++counter;
		
		switch(counter) {
		
			case 1:
				typeExpenses = "house";
				break;
			case 2:
				typeExpenses = "food";
				break;
			case 3:
				typeExpenses = "clothing";
				break;
			case 4:
				typeExpenses = "transportation";
				break;
			case 5:
				typeExpenses = "education";
				break;
			case 6:
				typeExpenses = "health care";
				break;
			default:
				typeExpenses = "vacations";
		}
		thirdy = expenses * 0.3;
		
		twentyThree = (expenses - thirdy) * 0.23;
		
		System.out.printf("%s%s%s%,.2f%s%,.2f%s%n", "The total of ", 
				typeExpenses, 
				" expenses by normal-direct taxes will be ", 
				expenses, 
				"$. (30% of the total: ", 
				thirdy, 
				"$. )");
		
		System.out.printf("%s%s%s%,.2f%s%,.2f%s%n%n", 
				"While the total of ", 
				typeExpenses, 
				" expenses by Fair Taxes will be ", 
				(expenses - thirdy) + twentyThree, 
				"$. (23% of the total: ",
				twentyThree,
				"$. )");
	}
}
