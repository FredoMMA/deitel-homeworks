// Fig. 4.4: Student.java
// Student class that store a student name and average
package Cap3;

public class Student {
	
	private String name;
	private double average;
	
	//constructor initializes instance variables
	public Student (String name, double average) {
		
		this.name = name; //assign to instance variable
		
		// validate that average is > 0.0 and <= 100.0; otherwise,
		// keep instance variable average's default value (0.0)
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; //assign to instance variable
	}
	
	// Set the student's name
	public void setName (String name) {
		
		this.name = name;
	}
	
	// get the student's name
	public String getName () {
		
		return name;
	}
	
	public void setAverage (double average) {
		
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average;
	}
	
	public double getAverage () {
		
		return average;
	}
	
	public String getLetterGrade () {
		
		String letterGrade = ""; // initialized to empty String
		
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
}
