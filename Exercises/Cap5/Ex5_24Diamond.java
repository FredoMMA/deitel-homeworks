package Cap5;

public class Ex5_24Diamond {

	public static void main(String[] args) {
		
		int counter2 = 1;
		
		for(int counter = 1; counter < 5; ++counter) {
			
			for(int space = 5; space > counter; --space) {
				
				System.out.print(" ");
			}
			
			for(int asterisk = 1; asterisk <= counter2; ++asterisk) {
				
				System.out.print("*");
			}
			
			for(int space = 5; space > counter; --space) {
				
				System.out.print(" ");
			}
			
			counter2 += 2;
			System.out.println();
		}
		
		for(int counter = 5; counter <= 10; ++counter) {
			
			for(int space = 5; space < counter; ++space) {
				
				System.out.print(" ");
			}
			
			for(int asterisk = 1; asterisk <= counter2; ++asterisk) {
				
				System.out.print("*");
			}
			
			for(int space = 5; space < counter; ++space) {
				
				System.out.print(" ");
			}
			
			counter2 -= 2;
			System.out.println();
		}
	}
}
