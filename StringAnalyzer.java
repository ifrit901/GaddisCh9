package ch9java6thedition;
import javax.swing.JOptionPane;

/**
 * This is Code Listing 9.5.
 * It uses several methods to analyze Strings for 
 * the presence of certain characteristics.
 * 
 * @author craig
 * 
 */
public class StringAnalyzer {
	public static void main(String[]args) {
		/*
		This program displays the number of letters, 
		numbers and whitespace characters in a String.
		*/	

		String input; 	// To hold user input
		char [] array;	// To hold a char array 

		int letters = 0;	// Number of letters
		int numbers = 0;	// Number of numbers
		int whitespaces = 0;	// Number of whitespaces

		// Get a String from the user
		input = JOptionPane.showInputDialog(null, "Enter a String:");

		// Convert the String to a char array
		array = input.toCharArray();

		// Analyze the characters
		for(int i = 0; i < array.length; i++) {
			if(Character.isLetter(array[i])) {
				letters++;
			}
			else if(Character.isDigit(array[i])) {
				numbers++;
			}
			else if(Character.isWhitespace(array[i])) {
				whitespaces++;
			}
		}
		
		// Display the results
		JOptionPane.showMessageDialog(null, "That String has \n"
			+ letters + " letters,\n"
			+ numbers + " numbers, \n"
			+ "and " + whitespaces + " whitespaces.");


		System.exit(0);

	}	
}
