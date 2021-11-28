package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * This is Code Listing 9.2.
 * 
 * @author craig
 * 2-12-21
 * 8:54am
 * 
 */
public class CustomerNumber {
	public static void main(String[]args) {
		/*
		This program tests a customer number to make 
		sure it is in the proper format.
		*/

		String input;	// To hold user input

		// Get a string from the user and test it for the correct format
		input = JOptionPane.showInputDialog("Enter a string in the form "
			+ "\"LLLNNNN\"\n(LLL = letters and NNNN = numbers.)");

		// Validate the input
		if(isValid(input)) {
			JOptionPane.showMessageDialog(null, "That's the correct format.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not the correct"
				+ " format.\nHere's an example: ABC1234");
		}

		System.exit(0);

	}	
	/**
	 * The isValid method tests a string to see if it's in 
	 * the correct format. It returns true if it is, false
	 * otherwise.
	 * @param str
	 * @return The value of the boolean goodSoFar
	 */
	public static boolean isValid(String str) {
		boolean goodSoFar = true;	// Flag
		int i = 0; 			// Control varaible

		// Test the length
		if(str.length() != 7) {
			goodSoFar = false;
		}

		// Test the first three characters for letters	
		while(goodSoFar && i < 3) {
			if(!Character.isLetter(str.charAt(i))) {
				goodSoFar = false;
			}

			i++;
		}

		// Test the rest of the characters for numbers
		while(goodSoFar && i < 7) {
			if(!Character.isDigit(str.charAt(i))) {
				goodSoFar = false;
			}

			i++;
		}

		return goodSoFar;
	}

}
