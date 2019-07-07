/*
https://javatutoring.com/calculate-area-of-circle-java-program/
*/

import java.util.Random;
import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args) 
	{

	// First calculation with random radius
		Random generator = new Random();
		int radius = generator.nextInt(50) + 1;
		double area = Math.PI * radius * radius;
		System.out.println("Example: Area of a circle is " + area + 
		  " when radius is equal " + radius + ".");
		System.out.println("");

	// Second with input from the user
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the radius (integer):");
		int r = s.nextInt();
		area = 22 * r * r / 7;
		System.out.println("Area of a circle is " + area + 
		  " when you gave radius equal " + r + ".");



	}

}
