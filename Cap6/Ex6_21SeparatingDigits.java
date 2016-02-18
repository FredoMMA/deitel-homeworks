package Cap6;

import java.util.Scanner;

public class Ex6_21SeparatingDigits {
	
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.print("Insert the value of A: ");
		a = input.nextInt();
		
		System.out.print("Insert the value of B: ");
		b = input.nextInt();
		
		int quotient = quotient(a, b);
		int remainder = remainder(a, b);
		
		System.out.printf("Quotient: %d%nRemainder: %d%n%n", quotient, remainder);
		
		System.out.print("Insert an integer to display between 1 and 99999: ");
		int number = input.nextInt();
		
		while(number > 99999 || number < 1) {
			
			System.out.println("Invalid value");
			System.out.print("Insert an integer to display between 1 and 99999: ");
			number = input.nextInt();
		}
		
		displayDigits(number);
	} //end main
	
	public static int quotient(int a, int b) {
		
		int result = a / b;
		return result;
	} // end quotient
	
	public static int remainder(int a, int b) {
		
		int result = a % b;
		return result;
	} // end remainder
	
	public static void displayDigits(int number) {
		
		int first;
		int second;
		int third;
		int fourth;
		int fifth;
		
		first = quotient(number, 10000);
		number = remainder(number, 10000);
		
		second = quotient(number, 1000);
		number = remainder(number, 1000);
		
		third = quotient(number, 100);
		number = remainder(number, 100);
		
		fourth = quotient(number, 10);
		number = remainder(number, 10);
		
		fifth = number;
		
		if(first == 0) {
			
			if(second == 0) {
				
				if(third == 0) {
					
					if(fourth == 0) {
						
						System.out.println(fifth);
					}
					
					else {
						
						System.out.println(fourth + "  " + fifth);
					}
				}
				
				else {
					
					System.out.println(third + "  " + fourth + "  " + fifth);
				}
			}
			
			else {
				
				System.out.println(second + "  " + third + "  " + fourth + "  " + fifth);
			}
			
		} // end if
		
		else {
			
			System.out.println(first + "  " + second + "  " + third + "  " + fourth + "  " + fifth);
		}
		
	} // end method displayDigits
} // end class
