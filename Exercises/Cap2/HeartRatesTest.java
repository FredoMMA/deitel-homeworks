package Cap2;

import java.util.Calendar;
import java.util.Scanner;

public class HeartRatesTest 
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		int currentDay = cal.get(Calendar.DATE);
		int currentMonth = cal.get(Calendar.MONTH) + 1;
		int currentYear = cal.get(Calendar.YEAR);
		
		Scanner input = new Scanner(System.in);
		
		HeartRates pessoa1 = new HeartRates("Carlos Humberto", "de Paula Borges", 6, 5, 1990, currentDay, currentMonth, currentYear);
		HeartRates pessoa2 = new HeartRates("Carlos Humberto", "Silva Borges", 5, 8, 1954, currentDay, currentMonth, currentYear);
		HeartRates pessoa3 = new HeartRates("Marcia", "de Paula Calil Borges", 7, 12, 1960, currentDay, currentMonth, currentYear);
		HeartRates pessoa4 = new HeartRates("","",0,0,0,0,0,0);
		
		System.out.println("The Heart Rates");
		System.out.printf("Current date: %d/%d/%d%n%n", currentDay, currentMonth, currentYear);
		statisticsHeart(pessoa1);
		statisticsHeart(pessoa2);
		statisticsHeart(pessoa3);
		
		System.out.print("Insert your first name: ");
		String firstName = input.nextLine();
		pessoa4.setFirstName(firstName);
		System.out.printf("%nInsert your last name: ");
		String lastName = input.nextLine();
		pessoa4.setLastName(lastName);
		System.out.printf("%nInsert your day of birth: ");
		int day = input.nextInt();
		pessoa4.setDay(day);
		System.out.printf("%nInsert the number of your month of birth: ");
		int month = input.nextInt();
		pessoa4.setMonth(month);
		System.out.printf("%nInsert your year of birth: ");
		int year = input.nextInt();
		pessoa4.setYear(year);
		pessoa4.setCurrentDate(currentDay, currentMonth, currentYear);
		System.out.println("");
		statisticsHeart(pessoa4);
		
		
	}
	
	public static void statisticsHeart(HeartRates pessoa)
	{
		System.out.printf("Name: %s %s%n", pessoa.getFirstName(), pessoa.getLastName());
		System.out.printf("Date of birth: %d/%d/%d%n", pessoa.getDay(), pessoa.getMonth(), pessoa.getYear());
		System.out.printf("Age: %d%n", pessoa.showAge());
		pessoa.maximumHeartRate(pessoa.showAge());
		pessoa.targetHeartRate(pessoa.showAge());
	}
}
