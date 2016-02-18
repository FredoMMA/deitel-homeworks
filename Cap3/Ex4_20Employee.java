package Cap3;

public class Ex4_20Employee {
	
	private String firstName;
	private String lastName;
	private double hoursWorked;
	private double hourlyRate;
	private double grossPay;
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void setHoursWorked(double hoursWorked) {
		
		if(hoursWorked > 0) {
			
			this.hoursWorked = hoursWorked;
		}
	}
	
	public double getHoursWorked() {
		
		return hoursWorked;
	}
	
	public void setHourlyRate(double hourlyRate) {
		
		if(hourlyRate > 0) {
			
			this.hourlyRate = hourlyRate;
		}
	}
	
	public double getHourlyRate() {
		
		return hourlyRate;
	}
	
	public void showGrossPay() {
		
		if(hoursWorked <= 40) {
			
			grossPay = hoursWorked * hourlyRate;
		}
		
		else {
			
			grossPay = (40 * hourlyRate) + (hoursWorked - 40) * (hourlyRate / 2);
		}
		
		System.out.printf("The gross pay of the %s %s for working %.1f hours is $%.2f%n%n", firstName, lastName, hoursWorked, grossPay);
	}

}
