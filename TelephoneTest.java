package ch9java6thedition;
import java.util.Scanner;
/**
 * This program tests the Telephone class.
 * 
 * @author craig
 * 2-23-21
 * 8:03am
 */
public class TelephoneTest {
	public static void main(String[]args) {
		/*
		The Telephone class contains static methods and variables,
		therefore there is no need to create objects of the class.
		*/

		// String varaible to hold user input
		String number;

		// Get an unformatted number from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an unformatted phone number:");
		number = input.nextLine();

		// Format the number
		System.out.println("The formatted telephone #: " + Telephone.format(number));

		// Get a properly formatted number and unformat it
		System.out.println("Enter a formatted number:");
		number = input.nextLine();

		// Unformat the number
		System.out.println("The unformatted form of that number is: " +
			Telephone.unformat(number));
	}	
}
