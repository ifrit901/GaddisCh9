package ch9java6thedition;

/**
 * This is code listing 9.6
 * 
 * @author craig
 * 2-22-21
 * 8:20am
 */
public class Telephone {
	/*
	The Telephone class provides static methods for formatting
	and unformatting US telephone numbers.
	*/

	// These constant fields hold the valid lengths of 
	// formatted and unformatted
	public static final int FORMATTED_LENGTH = 13;
	public static final int UNFORMATTED_LENGTH = 10;

	/**
	 * The isFormatted method tests a String to see if it is
	 * in the form "(xxx)xxx-xxxxx". 
	 * @param str The String to test
	 * @return true if it is properly formatted or false otherwise.
	 */
	public static boolean isFormatted(String str) {
		boolean valid;		// Flag

		// Determine whether str is properly formatted
		if(str.length() == FORMATTED_LENGTH &&
			str.charAt(0) == '(' &&
			str.charAt(4) == ')' &&
			str.charAt(8) == '-') 
			valid = true;
		else
			valid = false;

		return valid;
	}

	/**
	 * The unformat method accepts a string containing a telephone number
	 * formatted as;
	 * (xxx)xxx-xxxx. 
	 * If the argument is formatted in this way, 
	 * the method returns an unformatted string with the parentheses
	 * and hyphen removed. Otherwise, it returns the original argument.
	 * @param str The string to unformat
	 * @return An unformatted String
	 */
	public static String unformat(String str) {
		/**
		 * First, create a StringBuilder object and initialize it
		 * with 'str'. 
		 */
		StringBuilder strb = new StringBuilder(str);
		
		// If the argument is properly formatted, unformat it
		if(isFormatted(str)) {
			// Delete the left paren at position 0
			strb.deleteCharAt(0);

			// Delete the right paren. Since the previous 
			// deletion took a character away, the right
			// paren's position has changed from 4 to 3.
			strb.deleteCharAt(3);

			// Next delete the hyphen. It used to be at position
			// 8 but because of the previous two deletions, it is
			// now at position 6.
			strb.deleteCharAt(6);
		}
		
		// Return the unformatted string
		return strb.toString();
	}

	/**
	 * The format method formats a string in the form:
	 * (xxx)xxx-xxxx
	 * If the length of the string is UNFORMATTED_LENGTH, the 
	 * method will return the formatted string. Otherwise, it 
	 * returns the original argument.
	 * @param str The string to be potentially formatted
	 * @return A string formatted as a standard U.S. telephone number.
	 */
	public static String format(String str) {
		// Create a StringBuilder object initialized with 'str'
		StringBuilder strb = new StringBuilder(str);

		// Check that the string has length = UNFORMATTED_LENGTH
		if(str.length() == UNFORMATTED_LENGTH) {
			// If its the unformatted length, format it
			// Start by adding the left parenthesis
			strb.insert(0, "(");

			// Next, insert the right parenthesis
			strb.insert(4, ")");

			// Next, insert the hyphen
			strb.insert(8, "-");
		}

		return strb.toString();
	}
}


