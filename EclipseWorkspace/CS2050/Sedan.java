/**
 * 
 */

/**
 * 
 */
public class SedanOg extends Vehicle
{
	public Sedan(String make, String model, String color, String id, int year, double price)
	{
		super(make, model, color, id, year, price);
	}

	@Override
	public void setPrice(double price)
	{
		if (price >= 10000)
		{
			super.setPrice(10000);
		} else
		{
			super.setPrice(price);
		}
	}
}