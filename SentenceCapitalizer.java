package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 3. Sentence Capitalizer
 * 
 * Write a method that accepts a String object as an argument and 
 * returns a copy of the string with the first character of each 
 * sentence capitalized. For instance, if the argument is "hello.
 * my name is Joe. what is your name?" the method should rerturn 
 * "Hello. My name is Joe. What is your name?" Demonstrate the 
 * method in a program that asks the user to input a string and 
 * then passes it to the method. The modified string should be
 * displayed on the screen. 
 * 
 * @author craig
 * 2-26-21
 * 11:27
 */
public class SentenceCapitalizer {
	public static void main(String[]args) {

		String input = JOptionPane.showInputDialog(null, "Enter some short "
			+ "sentences"); 
		
		String [] sentences = input.split(".");
		for(int i = 0; i < sentences.length; i++) {
			
			System.out.print(sentences[i] + " ");
		}
		/*	
		JOptionPane.showMessageDialog(null, "The sentence with all the "
			+ "first letters capitlized is: " + capitalFirstWords(input));
		*/
		System.exit(0);
	}	
	/*	
	public static String capitalFirstWords(String str) {
		String [] sentances = str.split(". ");
		StringBuilder newSentances = new StringBuilder();

		for(int i = 0; i < sentances.length; i++) {

			/*
			char letter = Character.toUpperCase(sentances[i].charAt(0));
			String newLine = sentances[i].replace(sentances[i].charAt(0), letter);
			newLine += ". ";
			newSentances.append(newLine);
		}

		return newSentances.toString();
	}
	*/
	
}
