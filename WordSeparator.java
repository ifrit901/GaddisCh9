package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 14. Word Separator
 * 
 * Write a program that accepts as input a sentence in which all the words 
 * are run together, but the first character of each word is uppercase. Convert
 * the sentence to a string in which the words are separated by spaces 
 * and only the first word starts with an uppercase letter. For example, the
 * string "StopAndSmellTheRoses" would be converted to "Stop and smell 
 * the roses". 
 * @author craig
 */
public class WordSeparator {
	public static void main(String[]args) {
		String input = JOptionPane.showInputDialog(null, "Enter a sentence in which "
			+ "the words have no spaces between them "
			+ "\nand every word is capitalized. I'll return the sentence"
			+ "\nin corrected form.");

		JOptionPane.showMessageDialog(null, "The corrected sentence looks like this:"
			+ "\n" + sentenceCorrecter(input));
		System.exit(0);
	}	

	public static String sentenceCorrecter(String str) {
		StringBuilder stbr = new StringBuilder(str);
		char space = ' ';

		for(int i = 1; i < str.length(); i+=2) {
			if(Character.isUpperCase(stbr.charAt(i))) {
				stbr.insert(i, space);
			
				char ch = Character.toLowerCase(stbr.charAt(i + 1));
				stbr.setCharAt((i + 1), ch);
			}
		}
		
		String newString = stbr.toString();
		return newString;
	}
}
