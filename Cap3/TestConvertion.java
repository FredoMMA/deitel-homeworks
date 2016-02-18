package Cap3;

import java.util.Scanner;

public class TestConvertion {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, d;
		String b, c;
		int e;
		System.out.print("Choose what to do: \nInteger to String = 1\nString to Integer = 2\nQuit the program = 3\n");
		e = input.nextInt();
		
		while(e != 3) {
			
			if(e == 1) {
				
				System.out.print("Insert a value to convert from Integer to String: ");
				a = input.nextInt();
				b = Integer.toString(a);
				System.out.printf("The convertion from Integer to String is %s%n%n", b);
			}
			
			if(e == 2) {
				
				System.out.print("Insert a value to convert from String to Integer: ");
				c = input.next();
				d = Integer.valueOf(c.trim());
				System.out.printf("The convertion from String to Integer is %d%n%n", d);
			}
			
			if(e != 1 && e != 2 && e != 3) {
				
				System.out.println("Invalid option");
			}
			
			System.out.print("Choose what to do: \nInteger to String = 1\nString to Integer = 2\nQuit the program = 3");
			e = input.nextInt();
		}
		
	}
}
