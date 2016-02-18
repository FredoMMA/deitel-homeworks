package Cap2;

public class HeartRates 
{
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;
	private int currentDay;
	private int currentMonth;
	private int currentYear;
	
	public HeartRates(String firstName, String lastName, int day, int month, int year, int currentDay, int currentMonth, int currentYear)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		if(day > 0 && day < 31)
		{
			this.day = day;
		}
		
		if(month > 0 && month < 13)
		{
			this.month = month;
		}
		
		if(year > 1900)
		{
			this.year = year;
		}
		
		this.currentDay = currentDay;
		this.currentMonth = currentMonth;
		this.currentYear = currentYear;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setDay(int day)
	{
		if(day > 0 && day < 31)
		{
			this.day = day;
		}
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth(int month)
	{
		if(month > 0 && month < 13)
		{
			this.month = month;
		}
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear(int year)
	{
		if(year > 1900)
		{
			this.year = year;
		}
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setCurrentDate(int currentDay, int currentMonth, int currentYear)
	{
		this.currentDay = currentDay;
		this.currentMonth = currentMonth;
		this.currentYear = currentYear;
	}
	
	public int showAge()
	{
		int age = 0;
		
		if(currentDay >= day && currentMonth >= month)
		{
			age = currentYear - year;
		}
		if(currentDay < day && currentMonth <= month || currentDay >= day && currentMonth < month)
		{
			age = currentYear - year - 1;
		}
		
		return age;
	}
	
	public void maximumHeartRate(int age)
	{
		int maximumHR = 220 - age;
		System.out.printf("Maximum Heart Rate: %dbpm%n", maximumHR);
	}
	
	public void targetHeartRate(int age)
	{
		int thr50 = (220 - age)*(50)/(100); 
		int thr60 = (220 - age)*(60)/(100);
		int thr70 = (220 - age)*(70)/(100);
		int thr85 = (220 - age)*(85)/(100);
		System.out.printf("Target Heart Rate (50%%): %d%nTarget Heart Rate (60%%): %d%nTarget Heart Rate(70%%): %d%nTarget Heart Rate (85%%): %d%n%n", thr50, thr60, thr70, thr85);
	}
	
}
