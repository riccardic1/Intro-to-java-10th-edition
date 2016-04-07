public class Exercise_10
{
	public static void main(String[] args)
	{
		// One mile = 1.6 KM
		final double mile = 1.6;

		double average_speed_km = 14 / 45.5;
		double km_per_hour = average_speed_km * 60;
		double mph = km_per_hour / mile;

		// Displays message and avg speed
		System.out.println("The runner is moving at: " + mph + " MPH." );


	}
}