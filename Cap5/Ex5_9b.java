package Cap5;

import java.util.Scanner;

public class Ex5_9b {

	public static void main(String[] args) {
		
		int value = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a value to see if it's odd or even: ");
		
		while(input.hasNext()) {
			
			value = input.nextInt();
			
			switch (value % 2) {
			
			case 0:
				System.out.println("Even integer");
				break;
			case 1:
				System.out.println("Odd integer");
			}
			
			System.out.println();
			System.out.print("Input a value to see if it's odd or even: ");
		}
	}
}
