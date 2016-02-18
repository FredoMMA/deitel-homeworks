package Cap3;

import java.util.Scanner;

public class Ex4_31DecimalEquivalent {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long binary;
		long decimal;
		
		System.out.println("Binary to Decimal");
		System.out.print("Insert a binary value (0s and 1s, positive with the max of 10 digits, or -1 to QUIT): ");
		binary = input.nextLong();
		
		while(binary != -1) {
			
			verifyBinary(binary);
			
			long first = binary % 10;
			long second = ((binary % 100) - first) / 10;
			long third = ((binary % 1000) - second - first) / 100;
			long fourth = ((binary % 10000) - third - second - first) / 1000;
			long fifth = ((binary % 100000) - fourth - third - second - first) / 10000;
			long sixth = ((binary % 1000000) - fifth - fourth - third - second - first) / 100000;
			long seventh = ((binary % 10000000) - sixth - fifth - fourth - third - second - first) / 1000000;
			long eighth = ((binary % 100000000) - seventh - sixth - fifth - fourth - third - second - first) / 10000000;
			long nine = ((binary % 1000000000) - eighth - seventh - sixth - fifth - fourth - third - second - first) / 100000000;
			long ten = ((binary % 10000000000L) - nine - eighth - seventh - sixth - fifth - fourth - third - second - first) / 1000000000;
			
			decimal = (first * 1) + (second * 2) + (third * 4) + (fourth * 8) + (fifth * 16) + (sixth * 32) + (seventh * 64) + (eighth * 128) + (nine * 256) + (ten * 512);
			
			System.out.printf("The decimal value of the inserted binary value is: %d%n%n", decimal);
			
			System.out.println("Binary to Decimal");
			System.out.print("Insert a binary value (0s and 1s, positive with the max of 10 digits, or -1 to QUIT): ");
			binary = input.nextLong();
			
		}
		
		if(binary == -1) {
			
			System.out.println("Thank you!");
		}
	}

	public static void verifyBinary(long binary) {
		
		Scanner input = new Scanner(System.in);
		
		long first = binary % 10;
		long second = ((binary % 100) - first) / 10;
		long third = ((binary % 1000) - second - first) / 100;
		long fourth = ((binary % 10000) - third - second - first) / 1000;
		long fifth = ((binary % 100000) - fourth - third - second - first) / 10000;
		long sixth = ((binary % 1000000) - fifth - fourth - third - second - first) / 100000;
		long seventh = ((binary % 10000000) - sixth - fifth - fourth - third - second - first) / 1000000;
		long eighth = ((binary % 100000000) - seventh - sixth - fifth - fourth - third - second - first) / 10000000;
		long nine = ((binary % 1000000000) - eighth - seventh - sixth - fifth - fourth - third - second - first) / 100000000;
		long ten = ((binary % 10000000000L) - nine - eighth - seventh - sixth - fifth - fourth - third - second - first) / 1000000000;
		
		while(first != 1 && first != 0 || second != 1 && second != 0 || third != 1 && third != 0 || fourth != 1 && fourth != 0 || fifth != 1 && fifth != 0 || sixth != 1 && sixth != 0 || seventh != 1 && seventh != 0 || eighth != 1 && eighth != 0 || nine != 1 && nine != 0 || ten != 1 && ten != 0 || binary >= 10000000000L && binary < 0) {
			
			System.out.println("Invalid binary value");
			System.out.print("Insert a binary value (os and 1s): ");
			binary = input.nextInt();
			
			first = binary % 10;
			second = ((binary % 100) - first) / 10;
			third = ((binary % 1000) - second - first) / 100;
			fourth = ((binary % 10000) - third - second - first) / 1000;
			fifth = ((binary % 100000) - fourth - third - second - first) / 10000;
			sixth = ((binary % 1000000) - fifth - fourth - third - second - first) / 100000;
			seventh = ((binary % 10000000) - sixth - fifth - fourth - third - second - first) / 1000000;
			eighth = ((binary % 100000000) - seventh - sixth - fifth - fourth - third - second - first) / 10000000;
			nine = ((binary % 1000000000) - eighth - seventh - sixth - fifth - fourth - third - second - first) / 100000000;
			ten = ((binary % 10000000000L) - nine - eighth - seventh - sixth - fifth - fourth - third - second - first) / 1000000000;
			
		}
		
	}

}
