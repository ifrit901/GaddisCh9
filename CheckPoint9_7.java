package ch9java6thedition;

/**
 * This is checkPoint 9.7 - 9.16.
 * 
 * @author craig
 * 2-18-21
 * 8:24am
 */

public class CheckPoint9_7 {
	public static void main(String[]args) {
		/**
		 * 9.7 Write a method that accepts a reference to a String 
		 * object as an argument and returns true if the argument
		 * has a substring equal to "ger". Otherwise, the method 
		 * should return false.
		 */
		String name = "Barger";
		System.out.println(subString(name));;

		/**
		 * 9.8 Modify the method you wrote in 9.7 so that it 
		 * performs  a case-insensitive test. The method should
		 * return true if the String ends with "ger" in any 
		 * combination of capital and lower case letters.
		 */
		String name2 = "BarGER";
		System.out.println(trailingString(name2));

		/**
		 * 9.9 Look at the following declaration:
		 * 
		 * String cafe = "Broadway Cafe";
		 * String str;
		 * 
		 * Which of the following methods would you use to 
		 * make 'str' reference the String "Broadway"?
		 * 
		 * startsWith
		 * regionMatches
		 * substring 
		 * indexOf
		 * 
		 * answer: substring
		 */
		String cafe = "Broadway Cafe";
		String str;

		str = cafe.substring(0, 8);

		System.out.println(str);
		  
		/**
		 * 9.10 What is the difference between indexOf and lastIndexOf
		 * methods?
		 * 
		 * answer: indexOf returns the first instance of the character 
		 * passed and lastIndexOf returns the last instance of the 
		 * character argument.
		 */
		System.out.println(str.indexOf('B'));
		System.out.println(cafe.lastIndexOf('a'));

		/**
		 * 9.11 What is the difference between the getChars and
		 * substring methods?
		 * 
		 * answer: The getChars method puts the returned characters
		 * into a char array [], the substring method just returns
		 * the selected characters as a piece of a string.
		 * 
		 */
		char [] letters = new char [10];
		cafe.getChars(3, 12, letters, 0);
		System.out.println(letters);
		System.out.println(cafe.substring(3, 12));

		/**
		 * 9.12 The + operator, when used with strings, performs the 
		 * same operation as what String method?
		 * 
		 * answer: concat()
		 * 
		 * 9.13 What is the difference between the getChars and 
		 * toCharArray methods? 
		 * 
		 * answer: getChars retrieves a substring and puts the 
		 * characters in a pre-existing char array. The toCharArray
		 * method creates a new char array and puts a string in it.
		 * 
		 * 9.14 Look at the following code:
		 * 
		 * 	String str1 = "To be or not to be"; 
		 * 	String str2 = str1.replace('o', 'u');
		 * 	System.out.println(str1);
		 * 	System.out.println(str2);
		 * 
		 * You hear a fellow student claim that the code will display
		 * the following:
		 * 
		 * 	Tu be ur nut tu be
		 * 	Tu be ur nut tu be
		 * 
		 * Is your fellow student right or wrong? Why?
		 * 
		 * answer: The student is wrong. The first line will be the 
		 * unaltered "To be or not to be". The altered version is 
		 * assigned to the reference variable 'str2', so the 
		 * unaltered string continues to be referenced by 'str1'.
		 */
		  	String str1 = "To be or not to be"; 
		        String str2 = str1.replace('o', 'u');
		  	System.out.println(str1);
		  	System.out.println(str2);

		/**
		 * 9.15 What will the following code display? 
		 * 
		 * 	String str1 = "William ";
		 * 	String str2 = " the ";
		 * 	String str3 = " Conquerer";
		 * 	System.out.println(str1.trim() + str2.trim() + 
		 * 		str3.trim());
		 * 
		 * answer: The code will display "WilliamtheConquerer".	
		 */
			String str4 = "William ";
		  	String str5 = " the ";
		  	String str6 = " Conquerer";
		  	System.out.println(str4.trim() + str5.trim() + 
		  		str6.trim());

		/**
		 * 9.16 Assume that a program has the following declarations:
		 * 
		 * 	double number = 9.47;
		 * 	String str7;
		 * 
		 * Write a statement that assigns a String representation of
		 * the number variable to str7.
		 * 
		 * answer: str7 = String.number
		 */
			double number = 9.47;
			String str7 = String.valueOf(number);
			System.out.println(str7);
			
	}
	// 9.7
	public static boolean subString(String str) {
		boolean isPresent = false;

		if(str.endsWith("ger")) {
			isPresent = true;
		}

		return isPresent;
	}

	// 9.8
	public static boolean trailingString(String str) {
		boolean isPresent = false;

			String two = "ger";
			if(str.regionMatches(true, str.length() - 3, two, 0, two.length())) {
				isPresent = true;
			}

		return isPresent;
	}
}