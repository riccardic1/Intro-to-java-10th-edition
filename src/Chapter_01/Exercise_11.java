public class Exercise_11
{
	public static void main(String[] args)
	{
		
		double currentPop = 312032486;
		double secondsPerYear = 31536000;


		double birthsPerYr = secondsPerYear / 7.0;
		double deathsPerYr = secondsPerYear / 13.0;
		double immigrantsPerYr = secondsPerYear / 45.0;

		for (int i = 1; i <= 5; i++){

		currentPop += currentPop + birthsPerYr - deathsPerYr + immigrantsPerYr;

		System.out.println("The projected population year " + i +  " is: " + (int)currentPop);


		}
	}
}