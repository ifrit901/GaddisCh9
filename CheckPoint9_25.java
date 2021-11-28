package ch9java6thedition;

/**
 * This is check point 9.25 - 9.28
 * 
 * @author craig
 * 2-23-21
 * 2:00pm
 */
public class CheckPoint9_25 {
	public static void main(String[]args) {
		/**
		 * 9.25 The following string contains three tokens. What are they?
		 * What is the delimiter?
		 * 
		 * "apples pears bananas"
		 * 
		 * answer: The tokens are apples, pears, bananas. The delimiter 
		 * is a single space.
		 * 
		 * 9.26 Look at the following code:
		 * 
		 *	String str = "one two three four";
		 * 	String [] tokens = str.split(" ");
		 * 	int x = tokens.length;
		 * 
		 * 	String first = tokens[0];
		 * 
		 * What value will be stored in 'x'? What will the 'first' variable
		 * reference?
		 * 
		 * answer: The value 4 will be stored in 'x', the varaible 'first'
		 * will reference the value at element 0 in 'tokens' which is 
		 * the string "one".
		 */
		String str = "one two three four";
		String [] tokens = str.split(" ");
		int x = tokens.length;

		String first = tokens[0];

		System.out.println("The value in 'x' is " + x + ", " + 
			"\nThe value in 'first' is " + first);

		/**
		 * 9.27 Look at the following string:
		 * 
		 * 	"/home/rjones/mydata.txt"
		 * 
		 * Write code using the String class's split method that can be 
		 * used to extract the following tokens from the string:
		 * home, rjones, mydata, txt
		 */
		String str2 = "/home/rjones/mydata.txt";
		String [] tokens2 = str.split("[/.]");
		for(String s : tokens2) {
			System.out.println(s);
		}
		/**
		 * 9.28 Look at the following string:
		 * 
		 * 	"dog$cat@bird%squirrel"
		 * 
		 * Write code using the String class's split method that can be
		 * used to extract the following tokens from the string:
		 * 
		 * dog, cat, bird, squirrel
		 */
		String str3 = "dog$cat@bird%squirrel";
		String [] tokens3 = str3.split("[$@%]");
		for(String s : tokens3) {
			System.out.println(s);
		}

		int number = 14;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toOctalString(number));
		System.out.println(Integer.toHexString(number));

	}	
}
