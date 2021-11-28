package ch9java6thedition;

/**
 * These are the questions at the end of the chapter.
 * 
 * @author craig
 * 2-24-21
 * 9:28pm
 */
public class ChapterReviewQuestions {
	public static void main(String[]args) {


	/**
	 * Multiple choice and true/false
	 * 
	 * 1. The isDigit, isLetter, and isLetterOrDigit methods are members
	 *    of this class.
	 *    a. String 
	 *    b. Char
	 *    c. Character
	 *    d. StringBuilder
	 * 
	 * answer: c. Character
	 */	
		Character.isLetter('f');

	/**
	 * 2. This method converts a character to uppercase
	 *    a. makeUpperCase
	 *    b. toUpperCase
	 *    c. isUpperCase
	 *    d. upperCase
	 * 
	 * answer: b. toUpperCase
	 */
		Character.toUpperCase('c');
	/**
	 * 3. The startsWith, endsWith, and regionMatches methods are members
	 *    of this class.
	 *    a. String 
	 *    b. Char
	 *    c. Character
	 *    d. Wrapper
	 * 
	 * answer: String 
	 */
		String str = "Calcium";
		str.endsWith("um");
	/**
	 * 4. The indexOf and lastIndexOf methods are members of this class. 
	 *    a. String
	 *    b. Integer
	 *    c. Character
	 *    d. Wrapper
	 * 
	 * answer: a. String 
	 */
		String str2 = "Metroid";
		System.out.println(str2.indexOf("t"));
	/**
	 * 5. The substring, getChars, and toCharArray methods are members of
	 *    this class. 
	 *    a. String 
	 *    b. Float 
	 *    c. Character
	 *    d. Wrapper
	 * 
	 * answer: a. String
	 */
		String str3 = "Rubidium";
		char [] array = str3.toCharArray();
		System.out.println(array);
	/**
	 * 6. This String class method performs the same operation as the +
	 *    operator when used on strings. 
	 *    a. add
	 *    b. join 
	 *    c. concat
	 *    d. plus
	 * 
	 * answer: c. concat
	 */
		String str4 = "Roger";
		String str5 = "roger";
		System.out.println(str4.concat(str5));
	/**
	 * 7. The String class has several overloaded versions of a method
	 *    that accepts a value of any primitive data type as its argument
	 *    and returns a string representation of the value. The name of
	 *    the method is ________.
	 *    a. stringValue
	 *    b. valueOf
	 *    c. getString
	 *    d. valToString
	 * 
	 * answer: valueOf
	 */
		int x = 7;
		System.out.println(String.valueOf(x));
	/**
	 * 8. If you do not pass an argument to the StringBuilder constructor,
	 *    the object will have enough memory to store this many characters.
	 *    a. 16
	 *    b. 1
	 *    c. 256
	 *    d. Unlimited
	 * 
	 * answer: 16
	 */
		StringBuilder strb = new StringBuilder();
		System.out.println(strb.capacity());
	/**
	 * 9. This is one of the methods that are common to both the String 
	 *    and StringBuilder classes. 
	 *    a. append
	 *    b. insert
	 *    c. delete
	 *    d. length
	 * 
	 * answer:
	 */
		str5.length();
		strb.length();
	/**
	 * 10. To change the value of a specific character in a StringBuilder
	 *     object, use this method. 
	 *     a. changeCharAt
	 *     b. setCharAt
	 *     c. setChar
	 *     d. change
	 * 
	 * answer: b. setCharAt
	 */
		strb.append("one two three");
	 	strb.setCharAt(2, 'r');
	/**
	 * 11. To delete a specific character in a StringBuilder object, 
	 *     use this method.
	 *     a. deleteCharAt
	 *     b. removeCharAt
	 *     c. removeChar
	 *     d. expunge
	 * 
	 * answer: a. deleteCharAt
	 */
		strb.deleteCharAt(5);
		System.out.println(strb);
	/**
	 * 12. The character that separates tokens in a string is known as a ___.
	 *     a. separator
	 *     b. tokenizer
	 *     c. delimiter
	 *     d. terminator
	 * 
	 * answer: c. delimiter
	 * 
	 * 13. This String method breaks a string into tokens.
	 *     a. break 
	 *     b. tokenize
	 *     c. getTokens
	 *     d. split
	 * 
	 * answer: split
	 * 
	 * 14. These static final variables are members of the numeric 
	 *     wrapper classes and hold the minimum and maximum values 
	 *     of a particular data type. 
	 *     a. MIN_VALUE and MAX_VALUE
	 *     b. MIN and MAX
	 *     c. MINIMUM and MAXIMUM
	 *     d. LOWEST and HIGHEST
	 * 
	 * answer: a. MIN_VALUE and MAX_VALUE
	 */
		System.out.println(Integer.MIN_VALUE);
	/**
	 * True or False
	 * 
	 * 15. Character testing methods, such as isLetter, accept strings as
	 *     arguments and test each character in the string. 
	 * 
	 * False, they accept chars as arguments.
	 */
		Character.isLetter('y');
	/**
	 * 16. If the toUpperCase method's argument is already uppercase, 
	 *     it is returned as is, with no changes. 
	 * 
	 * True
	 */
		System.out.println(Character.toUpperCase('G'));
	/**
	 * 17. If toLowerCase method's argument is already lowercase, 
	 *     it will inadvertently be converted to uppercase. 
	 * 
	 * False
	 */
		System.out.println(Character.toLowerCase('g'));
	/**
	 * 18. The startsWith and endsWith methods are case-sensitive. 
	 * 
	 * True
	 */
		System.out.println(str4.startsWith("r"));
	/**
	 * 19. There are two versions of the regionMatches method: one 
	 *     that is case sensitive and one that can be case-insensitive.
	 * 
	 * True
	 */
		// str4 is "Roger"
		System.out.println(str4.regionMatches(true, 0, str5, 0, 3));
		// str5 is "roger"
		System.out.println(str4.regionMatches(0, str5, 0, 3));
	/**
	 * 20. The indexOf and lastIndexOf methods can find characters,
	 *     but cannot find substrings.
	 * 
	 * False
	 */
		System.out.println(str4.indexOf("ger"));
	/**
	 * 21. The String class's replace method can replace characters,
	 *     but cannot replace substrings. 
	 * 
	 * False 
	 */		
		// Must create a new string, since they are immutable
		String str6 = str4.replace("Rog", "rog");
		System.out.println(str6);
	/**
	 * 22. The StringBuilder class's replace method can replace characters,
	 *     but cannot replace substrings.
	 */
		strb.replace(6, 8, "xx");
		System.out.println(strb);
	/**
	 * 23. You can use the = operator to assign a string to a 
	 *     StringBuilder object.
	 * 
	 * False
	 */
		String cryBaby = "waa waa";
		//strb = cryBaby; 	// This produces an error
		// You have to pass the string as an argument to a 
		// StringBuilder object constructor
		StringBuilder strb2 = new StringBuilder(cryBaby);
		System.out.println(strb2);
	/**
	 * 2-25-21
	 * 7:05pm
	 * 
	 * Find the error
	 * 
	 * Find the error in each of the following code segments:
	 * 
	 * 1. int number = 99;
	 *    String str; 
	 *    // Convert number to a string.
	 *    str.valueOf(number);
	 * 
	 * I think this is wrong because the valueOf method is part 
	 * of the Integer wrapper class, not the String class. Let's see:
	 * ^^ this is wrong. valueOf is part of the String class
	 */
		/*
		This code makes you initialize the string to something
		before it will compile and then it still prints out 
		nothing for the string. Maybe because of immutability?
		*/
		int num = 99;
		String string = "";
		// Convert num to a string.
		string.valueOf(num);
		System.out.println(string);

		// I think you have to do it like this:
		String string1 = String.valueOf(num);
		System.out.println(string1);
	/**
	 * 2. // Store a name in a StringBuilder object.
	 *    StringBuilder name = "Joe Schmoe";
	 * 
	 * You can't initialize a StringBuilder object like this. 
	 * You can initialize a regular string like this but not 
	 * StringBuilder. StringBuilder has to formally call the 
	 * constructor with the 'new' operator.
	 */
		StringBuilder name = new StringBuilder("Joe Schmoe");
		System.out.println(name);
	/**
	 * 3. // Change the very first character of a StringBuilder
	 *    // object to 'Z'.
	 *    str.setCharAt(1, 'Z');
	 */
		name.setCharAt(1, 'Z');
		System.out.println(name);
		
		/* 
		The error in this code is that '1' is not the 
		position of the first character, it should be '0'.
		*/
		name.setCharAt(1, 'o');
		name.setCharAt(0, 'Z');
		System.out.println(name);
	/**
	 * 4. // Tokenize a string that is delimited 
	 *    // with semicolons. The string has 3 tokens.
	 *    String string2 = "one;two;three";
	 *    String tokens = string2.split(";");
	 *    System.out.println(tokens);
	 * 
	 * The problem is that the string is not tokenized, its just
	 * assigned to the value of another string variable, not 
	 * a char array. I'm not even sure what that does.
	 */
		String string2 = "one;two;three";
		/*
		This causes an error
		String tokens1 = string2.split(";");
		It should be written as follows:
		*/	
		String [] tokens1 = string2.split(";");
		for(String s : tokens1) {
			System.out.print(s + " and a ");
		}
	/**
	 * The Algorithm Workbench and Short Answer will be completed 
	 * in a different file.
	 */
	}
}
