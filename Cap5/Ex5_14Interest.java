package Cap5;

public class Ex5_14Interest {

	public static void main(String[] args) {
		
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		for(int counter = 1; counter <= 6; ++counter) {
			
			switch(counter) {
			
				case 1:
					break;
				
				default:
					rate = ((rate * 100.0) + 1.0) * 0.01;
			}
			
			System.out.printf("%n%s%f%%%n", "Interest Rate: ", (100.0 * rate));
			System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
			
			for(int year = 1; year <= 10; ++year) {
				
				amount = principal * Math.pow(1.0 + rate, year);
				
				System.out.printf("%4d%,20.2f%n", year, amount);
			} // end for year
		} // end for counter
		
	} // end main
} // end class
