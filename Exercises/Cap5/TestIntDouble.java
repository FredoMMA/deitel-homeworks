package Cap5;

public class TestIntDouble {

	public static void main (String[] args) {
		
		int amount;
		int  product = 100000;
		double rate = 0.05;
		
		for(int year = 1; year <= 10; ++year) {
			
			amount = (int) (product * Math.pow(1.0 + rate, year));
			System.out.printf("%d%n", amount);
		}
	}
}
