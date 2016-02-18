package Cap2;

import java.util.Scanner;

public class Ex3_14DateTest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Ex3_14Date date1 = new Ex3_14Date(05, 06, 1990);
		
		date1.displayDate();
		
		System.out.print("Redefine the month: ");
		int month = input.nextInt();
		date1.setMonth(month);
		
		System.out.print("Redefine the day: ");
		int day = input.nextInt();
		date1.setDay(day);
		
		System.out.print("Redefine the year: ");
		int year = input.nextInt();
		date1.setYear(year);
		
		date1.displayDate();
		
	}
}
	