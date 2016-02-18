package Cap3;

import java.util.Scanner;

public class Ex4_20SalaryCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Ex4_20Employee employee1 = new Ex4_20Employee();
		Ex4_20Employee employee2 = new Ex4_20Employee();
		Ex4_20Employee employee3 = new Ex4_20Employee();
		
		String firstName, lastName;
		double hoursWorked, hourlyRate, grossPay;
		int count = 1;
	
		while(count <= 3) {
			
			Ex4_20Employee employee = null;
			
			if(count == 1) {
				
				employee = employee1;
			}
			
			if(count == 2) {
				
				employee = employee2;
				input.nextLine();
			}
			
			if(count == 3) {
				
				employee = employee3;
				input.nextLine();
			}
			
			System.out.printf("Define the first name of the employee %d: ", count);
			firstName = input.nextLine();
			employee.setFirstName(firstName);
			
			System.out.printf("Define the last name of the employee %d: ", count);
			lastName = input.nextLine();
			employee.setLastName(lastName);
			
			System.out.printf("Input the hours worked of the employee %d: ", count);
			hoursWorked = input.nextDouble();
			employee.setHoursWorked(hoursWorked);
			
			System.out.printf("Input the hourly rate of the employee %d: ", count);
			hourlyRate = input.nextDouble();
			employee.setHourlyRate(hourlyRate);
			System.out.println("");
			
			++count;
		}
		
		employee1.showGrossPay();
		employee2.showGrossPay();
		employee3.showGrossPay();
	}
	
}
