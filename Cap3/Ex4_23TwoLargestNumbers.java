package Cap3;

import java.util.Scanner;

public class Ex4_23TwoLargestNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number;
		int largest;
		int secondLargest = 0;
		
		System.out.println("THE TWO LARGEST NUMBERS");
		System.out.print("Insert the number: ");
		number = input.nextInt();
		largest = number;
		
		while(counter < 10) {
			
			System.out.print("Insert the number: ");
			number = input.nextInt();
			
			if(counter == 1) {
				
				if(number < largest) {
					
					secondLargest = number;
				}
				
				if(number > largest || number == largest) {
					
					secondLargest = largest;
				}
				
				largest = number;
			}
			
			if(counter != 1) {
				
				if(number > largest) {
					
					secondLargest = largest;
					
					if(secondLargest == largest) {
						
						largest = number;
					}
					
				}
				
				if(number == largest) {
					
					secondLargest = number;
				}
				
				if(number < largest && number > secondLargest) {
					
					secondLargest = number;
				}
			}
			
			++counter;
		}
		
		System.out.printf("The largest number is %d%n", largest);
		System.out.printf("The second largest number is %d%n", secondLargest);
	}
}
