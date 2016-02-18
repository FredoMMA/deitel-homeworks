package Cap1;

import java.util.Scanner;

public class ex2_35CarPoolSavingsCalculator 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double totalKMPerDay, literGasoline, kmLiter, parkingFees, tolls, money;
		
		System.out.println("Car Pool Savings");
		System.out.print("Insert the total of Kilometers driven per day: ");
		totalKMPerDay = input.nextDouble();
		
		System.out.print("Insert the cost per liter of gasoline: ");
		literGasoline = input.nextDouble();
		
		System.out.print("Insert the average kilometers per liter that your car does: ");
		kmLiter = input.nextDouble();
		
		System.out.print("Insert your parking fees per day: ");
		parkingFees = input.nextDouble();
		
		System.out.print("Insert your amount of tolls per day: ");
		tolls = input.nextDouble();
		
		money = ((totalKMPerDay / kmLiter) * literGasoline) + parkingFees + tolls;
		
		System.out.printf("The total amount of money spent with your car, per day, is: %f%n");
		
	}
}
