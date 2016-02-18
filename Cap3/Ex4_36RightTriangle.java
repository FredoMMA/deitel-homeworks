package Cap3;

import java.util.Scanner;

public class Ex4_36RightTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int hip = 0;
		int cat = 0;
		
		System.out.print("Insert the first number: ");
		int a = input.nextInt();
		
		System.out.print("Insert the second number: ");
		int b = input.nextInt();
		
		System.out.print("Insert the third number: ");
		int c = input.nextInt();
		
		if(a > b && a > c) {
			
			hip = a*a;
			cat = (b*b) + (c*c);
		}
		
		if(b > a && b > c) {
			
			hip = b*b;
			cat = (a*a) + (c*c);
		}
		
		if(c > a && c > b) {
			
			hip = c*c;
			cat = (a*a) + (b*b);
		}
		
		System.out.println(hip);
		System.out.println(cat);
		
		if(cat == hip) {
			
			System.out.println("Those sides does represent a right triangle");
		}
		
		if(cat != hip) {
			
			System.out.println("Those sides does not represent a right triangle");
		}
	}
}
