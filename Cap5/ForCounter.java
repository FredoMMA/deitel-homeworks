package Cap5;

// Fig. 5.2: ForCounter.java
// Counter-controlled repetition with the for repetition statement.

public class ForCounter {

	public static void main (String[] args) {
		
		// for statement header includes initialization,
		// loop-continuation condition and increment
		for (int counter = 1 ; counter <= 10; ++counter) {
			
			System.out.printf("%d ", counter);
		}
		
		System.out.println();
		
		for (int counter2 = 1; counter2 <= 100; ++counter2) {
			
			System.out.printf("%d ", counter2);
		}
		
		System.out.println();
		
		for (int counter3 = 100; counter3 >= 1; --counter3) {
			
			System.out.printf("%d ", counter3);
		}
		
		System.out.println();
		
		for (int counter4 = 7; counter4 <= 77; counter4 += 7) {
			
			System.out.printf("%d ", counter4);
		}
		
		System.out.println();
		
		for (int counter5 = 20; counter5 >= 2; counter5 -=2) {
			
			System.out.printf("%d ", counter5);
		}
		
		System.out.println();
		
		for (int counter6 = 2; counter6 <= 20; counter6 += 3) {
			
			System.out.printf("%d ", counter6);
		}
		
		System.out.println();
		
		for (int counter7 = 99; counter7 >= 0; counter7 -= 11) {
			
			System.out.printf("%d ", counter7);
		}
		
		System.out.println();
		
	} // end main
} // end class ForCounter
