package ch9java6thedition;
import java.util.Scanner;
/**
 * This is code listing 9.3.
 * 
 * @author craig
 * 2-12-21
 * 11:10am
 * 
 */
public class CircleArea {
	public static void main(String[]args) {
		/*
		This program demonstrates the Character 
		class's toUpperCase method.
		*/
		double radius;		// To hold the circle's radius 
		double area;		// To hold the circle's area
		String input; 		// To hold a line of input
		char choice;		// To hold a single character

		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);

		do
		{
			// Get the circle's radius
			System.out.println("Enter the circle's radius:");
			radius = keyboard.nextDouble();

			// Consume the remaining newline character
			keyboard.nextLine();

			// Calculate and display the area of the circle
			area = Math.PI * radius * radius;
			System.out.printf("%,.2f\n", area);

			// Repeat this??
			System.out.println("Do you want to calculate the area"
				+ "\nof another circle? (y or n)");

			input = keyboard.nextLine();

			choice = input.charAt(0);

		} while(Character.toUpperCase(choice) == 'Y');
	}	
}
