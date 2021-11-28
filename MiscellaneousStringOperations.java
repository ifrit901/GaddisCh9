package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 12. Miscellaneous String Operations
 * 
 * Write a class with the following static methods: 
 * 
 * - WordCount. This method should accept a reference to a String object 
 *   as an argument and return the number of words contained in that object.
 * - arrayToString. This method accepts a char array as an argument and 
 *   converts it to a String object. The method should return a reference 
 *   to the String object.
 * - mostFrequent. This method accepts a reference to a String object as an
 *   argument and returns the character that occurs most frequently in
 *   the object. 
 * - replaceSubstring. This method accepts three references to String objects 
 *   as arguments. Let's call them string1, string2, and string3. It searches 
 *   string1 for all occurrences of string2. When it finds an occurrence of 
 *   string2, it replaces it with string3. For example, suppose the three 
 *   arguments have the following values:
 * 
 * 	string1:	"the dog jumped over the fence"
 * 	string2: 	"the"
 * 	string3: 	"that"
 * 
 *   With these three arguments, the method should return a reference to a 
 *   string object with the value "that dog jumped over that fence".
 * 
 *   Demonstrate each of these methods in a complete program.
 * 
 * @author craig
 * 4-7-21
 * 5:31pm
 * at home with Maria
 */
public class MiscellaneousStringOperations {
	public static void main(String[]args) {
		String input = JOptionPane.showInputDialog(null, "Enter a phrase or sentence "
			+ "and I'll do some text processing on it.");

		JOptionPane.showMessageDialog(null, "The number of werds in the text you "
			+ "gave me is " + WerdCount(input));

		char [] charArray = {'p', 'e', 'a', 'n', 'u', 't', ' ', 'b', 'u', 't', 't', 'e', 'r', ' ',
				'a', 'n', 'd', ' ', 't', 'u','n', 'a', ' ', 'f', 'i', 's', 'h', ' ',
				's', 'a', 'n', 'd', 'w','i', 'c', 'h'};

		JOptionPane.showMessageDialog(null, "Now, I'll take a char array containing "
			+ "the characters that are used in the phrase, \n\"peanut butter "
			+ "and tuna fish sandwich\" and turn them into a string.");

		JOptionPane.showMessageDialog(null, arrayToString(charArray));

		JOptionPane.showMessageDialog(null, "The character that occurs most "
			+ "frequently in the phrase you entered is " + mostFrequent(input));

		String word = JOptionPane.showInputDialog(null, "Enter a word in the phrase you gave initially"
			+ " and I'll replace it with a word of your choice:");

		String replacement = JOptionPane.showInputDialog(null, "Enter the word to "
			+ "replace it with:");

		JOptionPane.showMessageDialog(null, "The phrase with all the words replaced "
			+ "is: " + replaceSubString(input, word, replacement));
	}	

	public static int WerdCount(String str) {
		int werds = 0;
		String [] array = str.split(" ");
		werds = array.length;

		return werds;
	}

	public static String arrayToString(char [] array) {
		StringBuilder strb = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			strb.append(array[i]);
		}
		String phrase = strb.toString();
		return phrase;
	}

	public static char mostFrequent(String str) {
		char winner = str.charAt(0);
		int num = 0;
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			num = 0;
			for(int p = 0; p < str.length(); p++) {
				if(str.charAt(p) == str.charAt(i)) {
					num++;
				}
			}
			if(num > counter) {
				if(str.charAt(i) == ' ')
					continue;
				winner = str.charAt(i);
				counter = num;
			}	
		}
		return winner;
	}	

	public static String replaceSubString(String str1, String str2, String str3) {
		String newString = "";
		StringBuilder stbr = new StringBuilder(str1);
		int position = 0;
		while(position != -1) {
			stbr.replace(stbr.indexOf(str2), stbr.indexOf(str2) + str2.length(), str3);
			position = stbr.indexOf(str2, position + 1);
		}
		newString = stbr.toString();
		return newString;
	}
}
