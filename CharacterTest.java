package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * This is Code Listing 9.1.
 * 
 * @author craig
 * 2-12-21
 * 8:40am
 * 
 */
public class CharacterTest {
	public static void main(String[]args) {
		/*
		This program demonstrates some ablities of 
		the wrapper classes.
		*/
		String input;	// To hold user input
		char ch; 	// To hold a single character

		// Get a character from the user and store it in 'ch'
		input = JOptionPane.showInputDialog("Enter a single character");

		ch = input.charAt(0);

		// Test the character 
		if(Character.isLetter(ch)) {
			JOptionPane.showMessageDialog(null, "The character is a letter.");
		}

		if(Character.isDigit(ch)) {
			JOptionPane.showMessageDialog(null, "The character is a digit.");
		}

		if(Character.isLowerCase(ch)) {
			JOptionPane.showMessageDialog(null, "The character is lower case.");
		}

		if(Character.isUpperCase(ch)) {
			JOptionPane.showMessageDialog(null, "The character is upper case.");
		}

		if(Character.isSpaceChar(ch)) {
			JOptionPane.showMessageDialog(null, "The character is a space.");
		}

		if(Character.isWhitespace(ch)) {
			JOptionPane.showMessageDialog(null, "The character is whitespace.");
		}

		System.exit(0);
	}
}
