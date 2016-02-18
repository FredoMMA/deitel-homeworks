package Cap5;

public class Ex5_12 {

	public static void main(String[] args) {
		
		int odd = 1;
		
		for(int counter = 1; counter <= 15; ++counter) {
			
			if(counter % 2 == 1) {
				
				odd *= counter;
			}
		}
		
		System.out.printf("%s%,d", "The product of the odd integers from 1 to 15 is: ", odd);
	}
}
