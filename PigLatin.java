package ch9java6thedition;
import java.util.Scanner;
/**
 * 15. Pig Latin
 * Write a program that reads a sentence as input and converts each word to "Pig Latin". 
 * In one version of pig latin, you convert a word by removing the first letter, placing it 
 * at the end of the word, and then appending "ay" to the word. Here is an example:
 * 
 * English: 	I SLEPT MOST OF THE NIGHT
 * Pig Latin:	IAY LEPTSAY OSTMAY FOAY HETHAY IGHTNAY
 * 
 * @author craig
 * 4-14-21
 * 5:37am
 */
public class PigLatin {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		String sentence;
		System.out.println("Enter a sentence and I'll translate it to \"Pig Latin\":");
		sentence = input.nextLine();
		sentence = sentence.trim();

		System.out.println("The sentence in Pig Latin is: " + plTranslator(sentence));
	}	
	public static String plTranslator(String str) {
		String newSentence = "";
		String [] array = str.split(" ");
		for(String s : array) {
			StringBuilder stbr = new StringBuilder(s);
			stbr.append(stbr.charAt(0) + "AY ");
			stbr.deleteCharAt(0);
			newSentence += stbr;
		}
		
		return newSentence;
	}
}
