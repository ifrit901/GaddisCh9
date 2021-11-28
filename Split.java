package ch9java6thedition;

/**
 * This is code listing 9.8, it demonstrates the String class's 
 * split() method. 
 * 
 * @author craig
 * 2-23-21
 * 1:45pm
 */
public class Split {
	public static void main(String[]args) {
		// Create a string to tokenize
		String str = "one two three four";

		// Get the tokens, using a space delimiter
		String [] tokens = str.split(" ");

		// Display the tokens
		for(String s : tokens) {
			System.out.println(s);
		}
	}	
}
