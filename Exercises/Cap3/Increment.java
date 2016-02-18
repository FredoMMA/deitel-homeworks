package Cap3;

import java.util.Scanner;

public class Increment {
	
	public static void main(String[] args) {
		
		int c = 5;
		System.out.printf("C before postincrement: %d%n", c); //print 5
		System.out.printf("postincrementing C: %d%n", c++); // print 5
		System.out.printf("C after postincrement: %d%n%n", c); // print 6
		
		c = 5;
		System.out.printf("C before preincrement: %d%n", c); // print 5
		System.out.printf("preincrementing C: %d%n", ++c); //print 6
		System.out.printf("C after preincrement: %d%n%n", c); // print 6
	}

}
