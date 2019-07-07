/*
https://javatutoring.com/area-of-triangle-java-program/
*/

import java.util.Scanner;

public class AreaOfTriangle 
{
	public static void main(String[] args) 
    	{   
      		Scanner s = new Scanner(System.in);
        	System.out.println("We are going to calculate the area of triangle.");
         	System.out.println("Enter length of base:");
         	double bottom = s.nextDouble();
		System.out.println("Enter height:");
	        double height = s.nextDouble();
 		double area=(bottom * height) / 2;
      		System.out.println("Area of triangle is: " + area);      
   	}
}
