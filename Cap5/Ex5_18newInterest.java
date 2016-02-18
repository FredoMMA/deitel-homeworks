package Cap5;

public class Ex5_18newInterest {

	public static void  main(String[] args) {
		
		int amount; // amount on deposit at end of each year
		int principal = 100000; // initial amount before interest
		double rate = 0.05; // interest rate (%)
		
		// display headers
		System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
		
		// calculate amount on deposit for each of ten years
		for (int year = 1; year <= 10; ++year) {
			
			amount = (int) (principal * Math.pow(1.0 + rate, year));
			
			int dollars = amount / 100;
			
			int cents = amount % 100;
			
			System.out.printf("%4d%,17d", year, dollars);
			
			if(cents < 10) {
				
				System.out.printf(",0%d%n", cents);
			}
			
			else {
				
				System.out.printf(",%d%n", cents);
			}
			
		}
	}
}
