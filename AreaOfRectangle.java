/*
https://javatutoring.com/java-program-area-of-rectangle/
*/

import java.util.Scanner;

public class AreaOfRectangle 
{
	public static void main(String[] args) 
    	{   
      		Scanner s = new Scanner(System.in);
        	System.out.println("We are going to calculate the area of rectangle.");
         	System.out.println("Please enter first side of it:");
         	double side = s.nextDouble();
		System.out.println("Now enter second one:");
	        double bottom = s.nextDouble();
 		double area= bottom * side;
      		System.out.println("Area of this rectangle is: " + area + ".");      
   	}
}
