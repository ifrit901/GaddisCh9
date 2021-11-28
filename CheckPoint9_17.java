package ch9java6thedition;

/**
 * This is checkPoint 9.17 - 9.24.
 * 
 * @author craig
 * 2-23-21
 * 8:33am
 */
public class CheckPoint9_17 {
	public static void main(String[]args) {
		/**
		 * 9.17 The String class is immutable. What does this mean?
		 * 
		 * answer: This means that when a String is created, its
		 * contents cannot be changed. This makes Strings "thread safe",
		 * which means when Strings are accessed in a multithreaded 
		 * application, they will not be inadvertently changed.
		 * 
		 * 9.18 In a program that makes lots of changes to Strings,
		 * would it be more efficient to use Strings or StringBuilder
		 * objects?
		 * 
		 * answer: StringBuilder objects. They have methods for 
		 * changing and manipulating Strings that are not available 
		 * to the String class.
		 * 
		 * 9.19 Look at the following statement:
		 * 
		 * 	String city = "Ashville";
		 * 
		 * Rewrite this so that 'city' references a StringBuilder 
		 * object instead of a String.
		 */
		String city = "Ashville";
		StringBuilder strb = new StringBuilder(city);
		
		/**
		 * 9.20 You wish to add a string at the end of the existing contents
		 * of a StringBuilder object. What method do you use?
		 * 
		 * answer: append
		 *
		 * 9.21 You wish to insert a string into the existing contents
		 * of a StringBuilder object. What method do you use?
		 * 
		 * answer: insert
		 * 
		 * 9.22 You wish to delete a specific character from the existing
		 * contents of a StringBuilder object. What method do you use?
		 * 
		 * answer: delete
		 *
		 * 9.24 How does the StringBuilder class's replace method differ 
		 * from the String class's replace method?
		 * 
		 * answer: The difference is in the data types used. The String
		 * class replaces a char with another char and StringBuilder 
		 * replace replaces a substring with another string.
		 * 
		 * 
		 */
	}	
}
