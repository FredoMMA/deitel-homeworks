package Cap2;

public class Ex3_12Invoice 
{
	private String number; // part number
	private String description; // part description
	private int quantity; //quantity of the item being purchased
	private double price; //price of the item
	
	public Ex3_12Invoice (String number, String description, int quantity, double price)
	{
		this.number = number;
		this.description = description;
		if(quantity > 0)
		{
			this.quantity = quantity;
		}
		if(quantity < 0)
		{
			this.quantity = 0;
		}
		if(price > 0)
		{
			this.price = price;
		}
		if(price < 0)
		{
			this.price = 0;
		}
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setQuantity(int quantity)
	{
		if(quantity > 0)
		{
			this.quantity = quantity;
		}
		if(quantity < 0)
		{
			this.quantity = 0;
		}
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setPrice(double price)
	{
		if(price > 0)
		{
			this.price = price;
		}
		if(price < 0)
		{
			this.price = 0;
		}
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getInvoiceAmount()
	{
		return quantity * price;
	}
}
