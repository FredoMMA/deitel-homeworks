package Cap5;

public class Ex5_25newDiamond {

	public static void main(String[] args) {
		
		int counter2 = 1;
		
		for(int raws = 1; raws <= 19; raws += 2) {
			
			for(int counter = 1; counter < (raws - (raws / 2)); ++counter) {
				
				for(int space = (raws - (raws / 2)); space > counter; --space) {
					
					System.out.print(" ");
				}
				
				for(int asterisk = 1; asterisk <= counter2; ++asterisk) {
					
					System.out.print("*");
				}
				
				for(int space = (raws - (raws / 2)); space > counter; --space) {
					
					System.out.print(" ");
				}
				
				counter2 += 2;
				System.out.println();
			} // end for 1st part
			
			for(int counter = (raws - (raws / 2)); counter < (2 * (raws - (raws / 2))); ++counter) {
				
				for(int space = (raws - (raws / 2)); space < counter; ++space) {
					
					System.out.print(" ");
				}
				
				for(int asterisk = 1; asterisk <= counter2; ++asterisk) {
					
					System.out.print("*");
				}
				
				for(int space = (raws - (raws / 2)); space < counter; ++space) {
					
					System.out.print(" ");
				}
				
				counter2 -= 2;
				System.out.println();
			} // end for 2nd part
			
			counter2 = 1;
			System.out.println();
			
		} // end for raws
	} // end main
} // end class