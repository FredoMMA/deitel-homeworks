package Cap3;

import java.util.Scanner;

public class Resto {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert number: ");
		int binary = input.nextInt();
		
		int first = (binary) % 2;
		
		System.out.printf("First: %d", first);
	}

}
