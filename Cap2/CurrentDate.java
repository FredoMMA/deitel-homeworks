package Cap2;

public class CurrentDate 
{
	private int currentDay;
	private int currentMonth;
	private int currentYear;
	
	public CurrentDate (int currentDay, int currentMonth, int currentYear)
	{
		this.currentDay = currentDay;
		this.currentMonth = currentMonth;
		this.currentYear = currentYear;
	}
	
	public int getCurrentDay()
	{
		return currentDay;
	}
	
	public int getCurrentMonth()
	{
		return currentMonth;
	}
	
	public int getCurrentYear()
	{
		return currentYear;
	}
}
