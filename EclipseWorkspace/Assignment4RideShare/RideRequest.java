
import java.time.Duration;
import java.time.LocalDateTime;

public class RideRequest
{
	// TO COMPLETE: define all attributes
	private String passengerName;
	private String pickupLocation;
	private String destination;
	private LocalDateTime requestTime;
	private LocalDateTime assignedTime;

	public RideRequest(String passengerName, String pickupLocation, String destination)
	{
		// TO COMPLETE
		this.passengerName = passengerName;
		this.pickupLocation = pickupLocation;
		this.destination = destination;
		requestTime = LocalDateTime.now();
		assignedTime = null;
	}

	public void assignNow()
	{
		// TO COMPLETE
		assignedTime = LocalDateTime.now();
	}

	public long getWaitTimeSeconds()
	{
		// TO COMPLETE
		if (assignedTime == null)
		{
			return 0;
		}

		return Duration.between(requestTime, assignedTime).getSeconds();
	}

	@Override
	public String toString()
	{
		String information = "Passenger: " + passengerName + "\nPickup Location: " + pickupLocation + "\nDestination: "
				+ destination + "\nRequest Time: " + requestTime;

		if (assignedTime == null)
		{
			information += "\nAssigned Time: Not assigned";
		} else
		{
			information += "\nAssigned Time: " + assignedTime;
		}

		return information;
	}
}
