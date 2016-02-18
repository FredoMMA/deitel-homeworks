package Cap5;

// The Twelve Days of Christmas.

public class Ex5_29Song {

	public static void main(String[] args) {
		
		String phraseA = "On the ";
		String phraseB = " day of Christimas my true love sent to me";
		String day;
		
		for(int counter = 1; counter <= 12; ++counter) {
			
			switch(counter) {
			
				case 1:
					day = "First";
					break;
				case 2:
					day = "Second";
					break;
				case 3:
					day = "Third";
					break;
				case 4:
					day = "Fourth";
					break;
				case 5:
					day = "Fifth";
					break;
				case 6:
					day = "Sixth";
					break;
				case 7:
					day = "Seventh";
					break;
				case 8:
					day = "Eighth";
					break;
				case 9:
					day = "Ninth";
					break;
				case 10:
					day = "Tenth";
					break;
				case 11:
					day = "Eleventh";
					break;
				default:
					day = "Twelfth";
			}
			
			System.out.printf("%s%s%s%n", phraseA, day, phraseB);
			
			for(int counter2 = counter; counter2 >= 1; --counter2) {
				
				switch(counter2) {
				
				case 1:
					if(counter == 1) {
						
						System.out.printf("a Partridge in a Pear Tree.%n%n");
						break;
					}
					else {
						
						System.out.printf("and a Partridge in a Pear Tree.%n%n");
						break;
					}
				case 2:
					System.out.printf("Two Turtle Doves%n");
					break;
				case 3:
					System.out.printf("Three French Hens%n");
					break;
				case 4:
					System.out.printf("Four Calling Birds%n");
					break;
				case 5:
					System.out.printf("Five Gold Rings%n");
					break;
				case 6:
					System.out.printf("Six Geese a-Laying%n");
					break;
				case 7:
					System.out.printf("Seven Swans a-Swimming%n");
					break;
				case 8:
					System.out.printf("Eight Maids a-Milking%n");
					break;
				case 9:
					System.out.printf("Nine Ladies Dancing%n");
					break;
				case 10:
					System.out.printf("Ten Lords a-Leaping%n");
					break;
				case 11:
					System.out.printf("Eleven Pipers Piping%n");
					break;
				case 12:
					System.out.printf("Twelve Drummers Drumming%n");
					break;
				}
			}
		}
		
		
	}
}
