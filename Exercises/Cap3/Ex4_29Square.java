package Cap3;

import java.util.Scanner;

public class Ex4_29Square {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size;
		int count = 1;
		int count2 = 1;
		int count3 = 1;
		
		System.out.println("SQUARE OF ASTERISKS");
		System.out.print("Input the size of the square (minimum = 1, maximum = 20): ");
		size = input.nextInt();
		
			System.out.print("**");
			
			while (count <= size) {
				
				System.out.print("*");
				++count;
			}
			
			while (count2 <= size) {
				
				System.out.println();
				System.out.print("* ");
				
				while(count3 < size) {
					
					System.out.print(" ");
					++count3;
				}
				
				System.out.print("*");
				++count2;
				count3 = 1;
			}
			
			count = 1;
			System.out.println();
			System.out.print("**");
			
			while(count <= size) {
				
				System.out.print("*");
				++count;
			}
			
			
			
		}
}

