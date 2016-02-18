package Cap5;

public class Ex5_20Pi {

	public static void main(String[] args) {
		
		double pi = 4;
		double counter2 = 0;
		
		// The value of PI with 200000 terms
		for(int counter = 3; counter <= 400000; counter += 2) {
			
			++counter2;
			
			if(counter2 % 2 == 0) {
			
				pi += (4.0 /(double) counter);
			}
			else {
				
				pi -= (4.0 /(double) counter);
			} // end switch
		} // end for
		
		System.out.printf("%s%.6f%n", "The result of PI is ", pi);
		
		counter2 = 1;
		pi = 4;
		
		// The number of terms to get a value that begins with 3.14159
		for(int counter3 = 3; pi >= 3.13159; counter3 += 2) {
			
			++counter2;
			
			if(counter2 % 2 == 0) {
				
				pi += (4.0 /(double) counter3);
			}
			else {
				
				pi -= (4.0 /(double) counter3);
			}
		} // end for
		
		System.out.printf("%s%.1f%n", "The number of terms to have the value of 3.14159 is ", counter2);
	} // end main
} // end class
