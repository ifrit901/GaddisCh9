package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 13. Alphabetic Telephone Number Translator
 * 
 * Many companies use telephone numbers like 555-GET-FOOD 
 * so the number is easier for their customers to remember. 
 * On a standard telephone, the alphabetic letters are mapped to the 
 * numbers in the following fashion:
 * 
 * 	A, B, and C        = 2
 * 	D, E, and F        = 3
 * 	G, H, and I        = 4
 * 	J, K, and L         = 5
 * 	M, N, and O      = 6
 * 	P, Q, R and S    = 7
 * 	T, U, and V       = 8
 * 	W , X, Y, and Z = 9
 * 
 * Write an application that asks the user  to enter a 10-character phone number
 * in the format, "XXX-XXX-XXXX". The application should display the telephone 
 * number with any alphabetic characters that appeared in the original translated
 * to their numeric equivalent. For example, if the use enters 555-GET-FOOD, 
 * the application should display 555-438-3663.
 * 
 * @author craig
 * 4-8-21
 * 6:07pm
 * at home waiting for Maria to get back
 */
public class NumberTranslator {
	public static void main(String[]args) {
		String input = JOptionPane.showInputDialog(null, "Enter a phone number "
			+ "with words in it like 555-GET-FOOD. "
			+ "\nI'll return a copy of the number in numeric form.");

		JOptionPane.showMessageDialog(null, "The phone number in numeric form "
			+ "is " + numberTranslator(input));
	}	
	public static String numberTranslator(String str) {
		StringBuilder stbr = new StringBuilder(str);
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				if(str.charAt(i) == 'A' ||
				   str.charAt(i) == 'B' || 
				   str.charAt(i) == 'C')
					stbr.replace(i, i + 1, "2");
				if(str.charAt(i) == 'D' ||
				   str.charAt(i) == 'E' || 
				   str.charAt(i) == 'F')
					stbr.replace(i, i + 1, "3");
				if(str.charAt(i) == 'G' ||
				   str.charAt(i) == 'H' || 
				   str.charAt(i) == 'I')
					stbr.replace(i, i + 1, "4");
				if(str.charAt(i) == 'J' ||
				   str.charAt(i) == 'K' || 
				   str.charAt(i) == 'L')
					stbr.replace(i, i + 1, "5");
				if(str.charAt(i) == 'M' ||
				   str.charAt(i) == 'N' || 
				   str.charAt(i) == 'O')
					stbr.replace(i, i + 1, "6");
				if(str.charAt(i) == 'P' ||
				   str.charAt(i) == 'Q' || 
				   str.charAt(i) == 'R' ||
				   str.charAt(i) == 'S')
					stbr.replace(i, i + 1, "7");
				if(str.charAt(i) == 'T' ||
				   str.charAt(i) == 'U' || 
				   str.charAt(i) == 'V')
					stbr.replace(i, i + 1, "8");
				if(str.charAt(i) == 'w' ||
				   str.charAt(i) == 'X' || 
				   str.charAt(i) == 'Y' ||
				   str.charAt(i) == 'Z')
					stbr.replace(i, i + 1, "9");
				}
			}
		String newNumber = stbr.toString();
		return newNumber;
	}
}
