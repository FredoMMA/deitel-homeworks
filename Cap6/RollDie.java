package Cap6;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int counting1s = 0;
		int counting2s = 0;
		int counting3s = 0;
		int counting4s = 0;
		int counting5s = 0;
		int counting6s = 0;
		
		for (int rolls = 1; rolls <= 6000000; ++rolls) {
			
			int face = 1 + randomNumbers.nextInt(6);
			
			switch(face) {
			
				case 1:
					++counting1s;
					break;
				case 2:
					++counting2s;
					break;
				case 3:
					++counting3s;
					break;
				case 4:
					++counting4s;
					break;
				case 5:
					++counting5s;
					break;
				default:
					++counting6s;
			}
		}
		
		System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
				"Quantity of 1s: ", counting1s, 
				"Quantity of 2s: ", counting2s,
				"Quantity of 3s: ", counting3s,
				"Quantity of 4s: ", counting4s,
				"Quantity of 5s: ", counting5s,
				"Quantity of 6s: ", counting6s);
	}
}
