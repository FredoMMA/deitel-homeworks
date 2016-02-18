package Cap2;

import java.util.Scanner;
import java.util.Calendar;

public class HealthProfileApp {
	
	public static void main(String [] args) {
		
		Calendar cal = Calendar.getInstance();
		int currentDay = cal.get(Calendar.DATE);
		int currentMonth = cal.get(Calendar.MONTH) + 1;
		int currentYear = cal.get(Calendar.YEAR);
		
		Scanner input = new Scanner(System.in);
		
		HealthProfile pessoa1 = new HealthProfile("","",'M',0,0,0,0,0,0,0,0);
		
		System.out.println("Health Profile");
		System.out.print("Insert the first name of the patient: ");
		String firstName = input.nextLine();
		pessoa1.setFirstName(firstName);
		
		System.out.print("\nInsert the last name of the patient: ");
		String lastName = input.nextLine();
		pessoa1.setLastName(lastName);
		
		System.out.print("\nInsert the gender (M/F): ");
		char gender = input.nextLine().charAt(0);
		pessoa1.setGender(gender);
		
		System.out.print("\nInsert the day of birth: ");
		int day = input.nextInt();
		pessoa1.setDay(day);
		
		System.out.print("\nInsert the month (number) of birth: ");
		int month = input.nextInt();
		pessoa1.setMonth(month);
		
		System.out.print("\nInsert the year of birth: ");
		int year = input.nextInt();
		pessoa1.setYear(year);
		
		System.out.print("\nInsert the weight (Kg): ");
		double weight = input.nextDouble();
		pessoa1.setWeight(weight);
		
		System.out.print("\nInsert the height (meters): ");
		double height = input.nextDouble();
		pessoa1.setHeight(height);
		
		System.out.println();
		
		pessoa1.setCurrentDate(currentDay, currentMonth, currentYear);
		
		showProfile(pessoa1);
		
	}
	
	public static void showProfile(HealthProfile pessoa) {
		
		System.out.printf("Name of patient: %s %s%n", pessoa.getFirstName(), pessoa.getLastName());
		System.out.printf("Gender: %c%n", pessoa.getGender());
		System.out.printf("Date of Birth: %d/%d/%d%n", pessoa.getDay(), pessoa.getMonth(), pessoa.getYear());
		System.out.printf("Age: %d%n", pessoa.showAge());
		System.out.printf("Maximum Heart Rate: %d%n", pessoa.maximumHeartRate(pessoa.showAge()));
		pessoa.targetHeartRate(pessoa.showAge());
		System.out.printf("Body Mass Index (BMI): %.2f kg/m²%n", pessoa.bmi());
		
	}
}
