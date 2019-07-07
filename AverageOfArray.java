/*
https://beginnersbook.com/2017/09/java-program-to-calculate-average-using-array/
*/

import java.util.Random;
import java.util.Scanner;

public class AverageOfArray 
{
	public static void main(String[] args) 
	{

	// First calculation with random
		Random rand = new Random();
		int[] tab1 = new int[rand.nextInt(20) + 10];
		int sum = 0;
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = rand.nextInt(200) + 1;
			sum += tab1[i];
		}
		double avg = sum / tab1.length;
		System.out.println("First I made a table of " + tab1.length + " random numbers.");
		System.out.println("Than I calculated the average of them - it is " + avg + ".");
		System.out.println("Now you can do the same!");
		System.out.println("");

	// Second with input from the user
		Scanner s = new Scanner(System.in);		
		System.out.println("Define how big table would you like to have - it means how many numbers.");
		System.out.println("Write an integer number.");
		int size = s.nextInt();
		if (size > 20) {
			System.out.println("Big it is! A lot of writing! Are you sure? (Y/N)");
			Scanner scan = new Scanner(System.in);
    			String Process = scan.nextLine();
    			switch (Process) {
    				case "Y":
    				case "y": System.out.print("So start again and be smarter!");
    				         break;
    				case "N":
    				case "n": System.out.print("I will not play this game with you. Bye!");
   			        	break;

				default :
        		     		System.out.println("Wrong answer, really. Bye!")   ;
             				break;
    			}

/* NIE DZIAŁA
			String sure = s.nextLine();
			if (sure == "Y") {
				System.out.println("Start again and be smarter!");
			} else if (sure == "N") {
				System.out.println("I will not play this game. Bye!");
			} else {
				System.out.println("Wrong answer. Bye!");
			}
*/

		} else {
			double[] tab2 = new double[size];
			double sums = 0;
			for (int i = 0; i < size; i++) {
				if (i < 9) {
					System.out.print("Give me input nr.  " + (i+1) + " to the table:  ");
				} else {
					System.out.print("Give me input nr. " + (i+1) + " to the table:  ");
				}
				tab2[i] = s.nextDouble();
				sums += tab2[i];
			}
			double avgs = sums / size;
			System.out.println("Average of your inputs is " + avgs + ".");
		}
	}

}
