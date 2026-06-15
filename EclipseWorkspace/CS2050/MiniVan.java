/**
 * 
 */

public class MiniVan extends Vehicle
{
	public MiniVan(String make, String model, String color, String id, int year, double price)
	{
		super(make, model, color, id, year, price);
	}

	@Override
	public void setColor(String color)
	{
		if (color.equalsIgnoreCase("red"))
		{
			super.setColor("255-000-000");
		} else
		{
			super.setColor(color);
		}
	}
}
