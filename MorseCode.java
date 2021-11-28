package ch9java6thedition;
import java.util.Scanner;
/**
 * 16. Morse Code
 * Morse code is a code where each letter of the English alphabet, 
 * each digit, and various punctuation characters are represented 
 * by a series of dots and dashes. Table 9-14 shows part of the code.
 * Write a program that asks the user to enter a string, and then 
 * converts that string to Morse code. Use hyphens for dashes and 
 * periods for dots. 
 * 
 * @author craig
 * 4-14-21
 * 11:16am
 * on Unit B2012 with Colin R.
 */
public class MorseCode {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a phrase and I'll turn it into "
			+ "Morse Code:");
		String phrase = input.nextLine();
		MorseCodeTranslator msc = new MorseCodeTranslator(phrase);
		System.out.println("Here's the phrase in Morse Code:"
			+ "\n" + msc.translate());
	}	
}
