package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 2. Word Counter
 * 
 * Write a method that accepts a String object as an argument and 
 * returns the number of words it contains. For instance, if the 
 * argument is "Four score and seven years ago" the method should 
 * return the number 6. Demonstrate the method in a program that 
 * asks the user to input a string and then passes it to the method.
 * The number of words in the string should be displayed on the 
 * screen. 
 * 
 * @author craig
 * 2-26-21
 * 10:57am
 */
public class WordCounter {
	public static void main(String[]args) {
		String phrase;
		phrase = JOptionPane.showInputDialog(null, "Enter a phrase "
			+ "and I'll tell you how many words it has: ");
		JOptionPane.showMessageDialog(null, "The number of words in that "
			+ "phrase is " + countTheWords(phrase));
	}	

	/**
	 * The countTheWords method counts the number of words
	 * in a string phrase.
	 * @param str The string to count words from
	 * @return The number of words.
	 */
	public static int countTheWords(String str) {
		int numberOfWords = 0;
		String [] array = str.split(" ");
		numberOfWords = array.length;
		return numberOfWords;
	}
}
