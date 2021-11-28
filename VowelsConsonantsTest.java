package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * This program tests the VowelsConsonants class.
 * 
 * @author craig
 * 3-8-21
 * 4:35pm
 */
public class VowelsConsonantsTest {
	public static void main(String[]args) {

		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		String choice = "x"; 	// For menu choice

		

		while(!(choice.equals("e"))) {
			// Get a string as user input
			String input = JOptionPane.showInputDialog(null, "Enter a sentence for "
				+ "processing:");

			// Create a VowelsConsonants object
			VowelsConsonants vc = new VowelsConsonants(input);
	
			// Display menu
			choice = JOptionPane.showInputDialog(null, "\n\tText Processing Menu\n"
				+ "\na. Count the number of vowels in your sentence."
				+ "\nb. Count the number of consonants in your sentence."
				+ "\nc. Count both the vowels and consonants in your sentence."
				+ "\nd. Enter another sentence."
				+ "\ne. Exit the program.");
			
			choice.toLowerCase();	// Input validation

			switch(choice)	
			{
				case "a" : {
					numberOfVowels = vc.countTheVowels();
					JOptionPane.showMessageDialog(null, "There are "
						+ numberOfVowels + " vowels in the sentence"
						+ " you entered.");
					break;
				}

				case "b" : {
					numberOfConsonants = vc.countTheConsonants();
					JOptionPane.showMessageDialog(null, "There are "
						+ numberOfConsonants + " consonants in "
						+ "the sentence.");
					break;
				}

				case "c" : {
					JOptionPane.showMessageDialog(null, "The number of "
						+ "consonants and vowels combined is " 
						+ vc.countBoth());
					break;
				}

				case "d" : {
					continue;
				}

				case "e" : {
					break;
				}
			}
		}
	}
}
