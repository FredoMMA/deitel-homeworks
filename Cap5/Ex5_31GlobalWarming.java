package Cap5;

import java.util.Scanner;

public class Ex5_31GlobalWarming {

	public static void main(String[] args) {
		
		int countingAnswers = 0;
		String answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Global Warming Skeptics");
		
		for(int counter = 1; counter <= 5; ++counter) {
			
			switch(counter) {
			
				case 1:
					question(counter);
					answer = input.next();
					
					while(answer != "a" || answer != "A" || answer != "b" || answer != "B" || answer != "c" || answer != "C" || answer != "d" || answer != "D") {
						
						System.out.println("Invalid Answer");
						question(counter);
						answer = input.next();
					}
					
					if(answer == "d" || answer == "D") {
						
						++countingAnswers;
					}
					
					break;
				
				case 2:
					question(counter);
					answer = input.next();
					
					while(answer != "a" || answer != "A" || answer != "b" || answer != "B" || answer != "c" || answer != "C" || answer != "d" || answer != "D") {
						
						System.out.println("Invalid Answer");
						question(counter);
						answer = input.next();
					}
					
					if(answer == "a" || answer == "A") {
						
						++countingAnswers;
					}
					
					break;
					
				case 3:
					question(counter);
					answer = input.next();
					
					while(answer != "a" || answer != "A" || answer != "b" || answer != "B" || answer != "c" || answer != "C" || answer != "d" || answer != "D") {
						
						System.out.println("Invalid Answer");
						question(counter);
						answer = input.next();
					}
					
					if(answer == "d" || answer == "D") {
						
						++countingAnswers;
					}
					
					break;
					
				case 4:
					question(counter);
					answer = input.next();
					
					while(answer != "a" || answer != "A" || answer != "b" || answer != "B" || answer != "c" || answer != "C" || answer != "d" || answer != "D") {
						
						System.out.println("Invalid Answer");
						question(counter);
						answer = input.next();
					}
					
					if(answer == "d" || answer == "D") {
						
						++countingAnswers;
					}
					
					break;
				default:
					question(counter);
					answer = input.next();
					
					while(answer != "a" || answer != "A" || answer != "b" || answer != "B" || answer != "c" || answer != "C" || answer != "d" || answer != "D") {
						
						System.out.println("Invalid Answer");
						question(counter);
						answer = input.next();
					}
					
					if(answer == "a" || answer == "A") {
						
						++countingAnswers;
					}
			} // end switch
		} // end for
		
		switch(countingAnswers) {
		
			case 5:
				System.out.printf("Excellent! You got %d correct!%n", countingAnswers);
				break;
				
			case 4:
				System.out.printf("Very good. You got %d correct.%n", countingAnswers);
				break;
			
			default:
				System.out.printf("%s%d%s%n%s%n%s%n", "You got ", countingAnswers, " correct answers. Time to brush up on your knowledge of global warming, access: ", 
						"https://www.skepticalscience.com", 
						"To know more!");
		}
	} // end main
	
	public static void question(int counter) {
		
		switch (counter) {
		
			case 1:
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%n", "Question 1. What is the cause of global warming?", 
						"a. Emission of carbon dioxide from car exhaust, and factories into the atmosphere.",
						"b. Solar radiation trapped by carbon dioxide in the Earth's atmosphere.",
						"c. Cigarette Smoke, Aerosols, and CFC's",
						"d. All of the above");
				break;
			case 2:
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%n", "Question 2. Which of the following is a greenhouse gas that is released by human activities and speeds up global warming?", 
						"a. Carbon dioxide",
						"b. Natural gas",
						"c. Petroleum",
						"d. Nuclear power");
				break;
			case 3:
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%n", "Question 3. Which of the following human activities does NOT release carbon dioxide into the atmosphere?", 
						"a. Burning fossil fuels",
						"b. Deforestation",
						"c. Driving",
						"d. Fishing");
				break;
			case 4:
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%n", "Question 4. As global warming continues, the intensity of what type of storm that hits coastlines is predicted to increase?", 
						"a. Tornadoes",
						"b. Tsunamis",
						"c. Earthquakes",
						"d. Hurricanes");
				break;
			default:
				System.out.printf("%s%n%s%n%s%n%s%n%s%n%n", "Question 5. Rising water temperatures is a result of global warming and may eventually increase sea levels due to the dissolving of what?", 
						"a. Glaciers",
						"b. River beds",
						"c. Wetlands",
						"d. Mountains");
			
		}
	}
}
