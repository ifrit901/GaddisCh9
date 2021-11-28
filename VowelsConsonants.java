package ch9java6thedition;

/**
 * 4. Vowels and Consonants
 * 
 * Write a class with a constructor that accepts a String object 
 * as its argument. The class should have a method that returns 
 * the number of vowels in a string, and another method that 
 * returns the number of consonants in the string. Demonstrate 
 * the class in a program that performs the following steps:
 * 
 * 1. The user is asked to enter a string.
 * 2. The program displays the following menu:
 *    a. Count the number of vowels in the string.
 *    b. Count the number of consonants in the string.
 *    c. Count both the vowels and consonants in the string.
 *    d. Enter another string. 
 *    e. Exit the program. 
 * 3. The program performs the operation selected by the user and
 *    repeats until the user enters 'e' to exit the program.
 * 
 * 
 * @author craig
 */
public class VowelsConsonants {
	private String input;	
	private char choice;
	private char [] vowels = {'a', 'e', 'i', 'o', 'u'};
	private char [] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 
				      'j', 'k', 'l', 'm', 'n', 'p', 
				      'q', 'r', 's', 't', 'v', 'w', 
				      'x', 'y', 'z'};

	public VowelsConsonants(String str) {
		input = str;
	}

	public int countTheVowels() {
		int numberOfVowels = 0;
		for(int i = 0; i < input.length(); i++) {
			for(int p = 0; p < vowels.length; p++) {
				if(vowels[p] == input.charAt(i)) {
					numberOfVowels++;
				}
			}
		}
		return numberOfVowels;
	}

	public int countTheConsonants() {
		int numberOfConsonants = 0;
		for(int i = 0; i < input.length(); i++) {
			for(int p = 0; p < consonants.length; p++) {
				if(consonants[p] == input.charAt(i)) {
					numberOfConsonants++;
				}
			}
		}
		return numberOfConsonants;
	}

	public int countBoth () { 
		int both = 0;
		both = countTheVowels() + countTheConsonants();
		return both;
	}

}
