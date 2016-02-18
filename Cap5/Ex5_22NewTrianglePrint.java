package Cap5;

public class Ex5_22NewTrianglePrint {

	public static void main(String[] args) {
			
		System.out.printf("%-17s%-17s%-17s%-17s%n", "A", "B", "C", "D");
		for(int counter = 1; counter <= 10; ++counter) {
			
			for(int asterisk = 1; asterisk <= counter; ++asterisk) { // A
				
				System.out.print("*");
			}
			
			for(int separateSpace = 15; separateSpace >= counter; --separateSpace) {
				
				System.out.print(" ");
			}
			
			for(int asterisk = 10; asterisk >= counter; --asterisk) { // B
				
				System.out.print("*");
			}
			
			for(int separateSpace = 1; separateSpace <= counter ; ++separateSpace) {
				
				System.out.print(" ");
			}
			
			for(int extraSpace = 1; extraSpace <= 5; ++extraSpace) {
				
				System.out.print(" ");
			}
			
			for(int space = 1; space < counter; ++space) { // C
				
				System.out.print(" ");
			}
			
			for(int asterisk = 10; asterisk >= counter; --asterisk) {
				
				System.out.print("*");
			}
			
			for(int separateSpace = 1; separateSpace < 5; ++separateSpace) {
				
				System.out.print(" ");
			}
			
			for(int space = 10; space > counter; --space) { // D
				
				System.out.print(' ');
			}
			
			for(int asterisk = 1; asterisk <= counter; ++asterisk) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}