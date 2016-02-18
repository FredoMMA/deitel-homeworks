package Cap2;

public class Ex3_13EmployeeTest 
{
	public static void main(String[] args)
	{
		double newSalary1, newSalary2;
		
		Ex3_13Employee employee1 = new Ex3_13Employee("Carlos Humberto", "Borges", 1000.00);
		Ex3_13Employee employee2 = new Ex3_13Employee("Diego", "Borges", 800.00);
				
		System.out.printf("The year salary of the employee %s %s is %.2f R$%n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary() * 12);
		System.out.printf("The year salary of the employee %s %s is %.2f R$%n", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary() * 12);
		
		newSalary1 = (employee1.getSalary() * 0.1) + employee1.getSalary();
		newSalary2 = (employee2.getSalary() * 0.1) + employee2.getSalary();
		
		employee1.setSalary(newSalary1);
		employee2.setSalary(newSalary2);
		
		System.out.printf("The year salary of the employee %s %s with a 10 per cent raise is %.2f R$%n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary()*12);
		System.out.printf("The year salary of the employee %s %s with a 10 per cent raise is %.2f R$%n", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary()*12);
	}
}
