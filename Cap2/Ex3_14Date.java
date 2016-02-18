package Cap2;

public class Ex3_14Date 
{
	private int month;
	private int day;
	private int year;
	
	public Ex3_14Date(int month, int day, int year)
	{
		if(month > 0 && month < 13)
		{
			this.month = month;
		}
		if(day > 0 && day < 31)
		{
			this.day = day;
		}
		this.year = year;
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
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void displayDate()
	{
		System.out.printf("The date is: %d/%d/%d%n", month, day, year);
	}
}
