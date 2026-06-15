/**
 * 
 */

/**
 * 
 */
public class SUV extends Vehicle
{
	public SUV(String make, String model, String color, String id, int year, double price)
	{
		super(make, model, color, id, year, price);
	}

	@Override
	public void setId(String id)
	{
		if (id.length() > 15)
		{
			super.setId(id.substring(0, 15));
		} else
		{
			super.setId(id);
		}
	}
}