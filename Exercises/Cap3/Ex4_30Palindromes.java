package Cap3;

import java.util.Scanner;

public class Ex4_30Palindromes {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int palindrome;
		int first, second, third, fourth, fifth;
		
		System.out.println("PALINDROMES");
		System.out.print("Insert the integer to see if It's a palindrome or not (Max and Min of 5 digits): ");
		palindrome = input.nextInt();
		
		if(palindrome != 0) {
			
			while(palindrome < 10000 || palindrome > 99999) {
				
				System.out.println("Incorrect integer (must have 5 digits)");
				System.out.print("Insert the integer to see if It's a palindrome or not (Max and Min of 5 digits): ");
				palindrome = input.nextInt();
			}
		}
		
		first = (palindrome / 10000);
		second = (palindrome / 1000) - (first * 10);
		third = (palindrome / 100) - (first * 100) - (second * 10);
		fourth = (palindrome / 10) - (first * 1000) - (second * 100) - (third * 10);
		fifth = palindrome - (first * 10000) - (second * 1000) - (third * 100) - (fourth * 10);
		
		if(first == fifth && second == fourth || palindrome == 0) {
			
			System.out.println("It is a palindrome!");
		}
		
		else {
			
			System.out.println("It's not a palindrome");
		}
	}

}
