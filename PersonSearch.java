package ch9java6thedition;
import java.util.Scanner;
/**
 * This is Code Listing 9.4.
 * It demonstrates the startsWith method that performs
 * a case sensitive comparison of a given set of 
 * characters to those at the beginning of a String.
 * 
 * @author craig
 * 2-13-21
 * 6:36am
 * 
 */
public class PersonSearch {
	public static void main(String [] args)	{
		String lookUp; 		// To hold a String to find

		// Create an array of Strings
		String [] names = {"Cutshaw, Will,", "Davis, George", 
				   "Davis, Jenny", "Russart, Phil", 
				   "Russell, Cindy", "Setzer, Charles",
				   "Smathers, Holly", "Smith, Chris",
				   "Smith, Brad", "Williams, Jean" };

		// Use the startsWith method to do name searches
		Scanner input = new Scanner(System.in);

		// Get a partial name to look for
		System.out.println("Enter the first four letters of someone's "
			+ "name \nand I'll check to see if it's in the list.");
		lookUp = input.nextLine();

		// Display all the names that start with the letters in
		// the string entered by the user. 
		System.out.println("Here are the names that match:");
		for(String person: names) {
			if(person.startsWith(lookUp)) {
				System.out.println(person);
			}
		}
	}	
}
