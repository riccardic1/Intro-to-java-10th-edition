public class Exercise_08
{
	public static void main (String[] args)
	{
		double perimeter, area;
		final double radius = 5.5;

		perimeter = 2 * radius * 3.145;
		area = radius * radius * 3.145;

		System.out.println("The area of the circle is: " + area);
		System.out.println("The perimeter of the circle is: " + perimeter);
	}
}