package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 
 * @author craig
 */
public class SentenceCapitalizer2 {
	public static void main(String[]args) {
		String input;
		input = JOptionPane.showInputDialog(null, "Enter some sentences with the "
			+ "first letter of the first \nword in each sentence lowercase:");
		JOptionPane.showMessageDialog(null, "After correcting the first letter the "
			+ "sentence becomes: " + sentenceCapitalizer(input));
	}	

	public static String sentenceCapitalizer(String str) {
		StringBuilder stb = new StringBuilder(str);
		int i; 
		
		// Capitalize the first letter
		stb.setCharAt(0, Character.toUpperCase(stb.charAt(0)));

		// Get the index of the first period followed by a space
		i = stb.indexOf(".");
		while (i != -1) {
			// Increment i
			i++;
			// Find the first character
			while(i < stb.length() && stb.charAt(i) == ' ') 
				i++;
			// Capitalize the character
			stb.setCharAt(i, Character.toUpperCase(stb.charAt(i)));

			i = stb.indexOf(". ", i);

		}
		return stb.toString();
	}
}
