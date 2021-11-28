package ch9java6thedition;

/**
 * This is the Algorithm workbench and short answer.
 * 
 * @author craig
 * 2-25-21
 * 7:47pm
 * 
 */
public class AlgorithmWorkbench_ShortAnswer {
	public static void main(String[]args) {
		/**
		 * 1. The following statement determines whether 'choice' is 
		 * equal to 'Y' or 'y'. 
		 * 
		 * 	if(choice == 'Y' || choice == 'y')
		 * 
		 * Rewrite this statement so that it only makes one 
		 * comparison and does not use the || operator.
		 */
		char choice = 'Y';
		if(String.valueOf(choice).equalsIgnoreCase("y")) {
			System.out.println("The char = 'y' or 'Y'.");
		}
		
		// Or..
		if(Character.toUpperCase(choice) == 'Y') {
			System.out.println("You chose \"Y\"");
		}

		/**
		 * 2. Write a loop that counts the number of space characters
		 * that appear in the String object str.
		 */

		int total = 0; 	// Accumulator
		String str = "one two three four five";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') 
				total += 1;
		}

		System.out.println("The number of spaces in 'str' is " + total);

		//  This can be re-written as:
		int total2 = 0;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isSpaceChar(str.charAt(i))) {
				total2++;
			}
		}
		/**
		 * 3. Write a loop that counts the number of digits that 
		 * appear in the String object str.
		 */
		String str1 = "134hj3k2312jk34kh213khj1234kj";
		int total1 = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(Character.isDigit(str1.charAt(i)))
				total1++;
		}

		System.out.println("The number of numbers in string 'str1' is "
			+ total1);

		/**
		 * 4. Write a loop that counts the number of lowercase letters
		 * in String object str.
		 */
		String str2 = "SDFShgfghhgfHGFHHGDFHfdfgh";
		int total3 = 0; 
		for(int i = 0; i < str2.length(); i++) {
			if(Character.isLowerCase(str2.charAt(i))) {
				total3++;
			}
		}

		System.out.println("The number of lowecase letters in 'str2' is "
			+ total2);

		/**
		 * 5. Write a method that accepts a reference to a String object
		 * as an argument and returns true if the argument ends with the
		 * substring ".com". Otherwise, the method should return false.
		 */
		String address = "google.com";
		if(isWebAddress(address))
			System.out.println("The string is a web address.");
		else
			System.out.println("The string is not a web address.");

		/**
		 * 6. Modify the method you wrote in the last problem so that is
		 * performs a case-insensitive test. The method should return 
		 * true if the argument ends with ".com" in any possible 
		 * combination of upper or lowercase letters.
		 */
		String address1 = "cats.Com";
		if(isAnyDotCom(address1)) {
			System.out.println("The regions match no matter what"
				+ " the case is.");
		}
		else
			System.out.println("The regions don't match regardless "
				+ "of case.");
		/**
		 * 7. Write a method that accepts a StringBuilder object as an 
		 * argument and converts all occurrences of the lowercase letter
		 * 't' in the object to uppercase.
		 */
		StringBuilder lowerTtoupperT = 
			new StringBuilder("the rain in sthpain sthtays mainly"
				+ " in the plain.");
		
		// Version 1 returns a new StringBuilder object with
		// all the t's changed.
		System.out.println(toUpperCase(lowerTtoupperT));

		// Version 2 returns the original object with all the 
		// t's replaced with T's.
		System.out.println(replaceToUppercaseT(lowerTtoupperT));

		/**
		 * 8. Look at the following string:
		 * 
		 * 	"cookies>milk>fudge:cake:ice cream"
		 * 
		 * Write code using the String class's split method that 
		 * can be used to extract the following tokens from the 
		 * string: cookies, milk, fudge, cake, and ice cream
		 */
		String sugar = "cookies>milk>fudge:cake:ice cream";
		String [] sweets = sugar.split("[>:]");
		for(String s : sweets) 
			System.out.print(s + " ");
		System.out.println();

		/**
		 * 9. Assume that 'd' is a double variable. Write an if 
		 * statement that assigns 'd' to the int variable 'i' if
		 * the value in 'd' is not larger than the maximum value
		 * for an int.
		 */
		double d = 1234343.54323;
		int i = 0;
		if(!(d > Integer.MAX_VALUE))
			i = (int)d;

		System.out.println(i);

		/**
		 * 10. Write code that displays the contents of the int 
		 * variable 'i' in binary, hexadecimal, and octal.
		 */
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));

		/**
		 * Short Answer
		 * 
		 * 1. Why would you use StringBuilder objects instead of 
		 * String objects in a program that makes lots of changes
		 * to strings?
		 * 
		 * answer: Because StringBuilder objects have methods for
		 * being changed and Strings are immutable.
		 * 
		 * 2. A program reads a string as input from the user for 
		 * the purpose of tokenizing it. Why is it a good idea to 
		 * trim the string before tokenizing it?
		 * 
		 * answer: Because if there is any leading or trailing 
		 * whitespace, it will become part of the first and 
		 * last token.
		 * 
		 * 3. Each of the numeric wrapper classes has a static 
		 * toString method. What do these methods do? 
		 * 
		 * answer: They convert the value of the numeric data 
		 * type to a string. 
		 */
	}	
	// #5
	public static boolean isWebAddress(String str) {
		boolean isAddress;
		if(str.endsWith(".com"))
			isAddress = true;
		
		else
			isAddress = false;

		return isAddress;
	}

	// #6
	public static boolean isAnyDotCom(String str) {
		boolean isAddress;
		String ending = ".com";
		if(str.regionMatches(true, str.length() - 4, ending, 0, 4))
			isAddress = true;
		
		else
			isAddress = false;

		return isAddress;
	}

	// #7 version 1
	public static StringBuilder toUpperCase(StringBuilder strb) {
		StringBuilder builder = new StringBuilder();	
		for(int i = 0; i < strb.length(); i++) {
			if(strb.charAt(i) == 't')
				builder.append('T');
			else
				builder.append(strb.charAt(i));
		}
		return builder; 
	}

	// Also #7 version 2
	public static StringBuilder replaceToUppercaseT(StringBuilder strb) {
		for(int i = 0; i < strb.length(); i++) {
			if(strb.charAt(i) == 't')
				strb.replace(i, i + 1, "T");
		}
		return strb;
	}


}
