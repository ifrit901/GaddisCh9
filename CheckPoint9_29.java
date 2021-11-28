package ch9java6thedition;

/**
 * This is check point 9.29 - 9.31.
 * 
 * @author craig
 * 2-23-21
 * 4:31pm
 */
public class CheckPoint9_29 {
	public static void main(String[]args) {
		/**
		 * 9.29 Write a statement that converts the following integer
		 * to a String and stores it in the String object referenced 
		 * by 'str':
		 * 
		 * 	int i = 99;
		 * 
		 */
		int i = 99;
		String str = Integer.toString(i);
		System.out.println(str);

		/**
		 * 9.30 What wrapper class methods convert a number from a 
		 * decimal to another numbering system? What wrapper classes 
		 * are these methods a member of?
		 * 
		 * answer:  toBinaryString, to OctalString, toHexString. They 
		 * are members of the Integer and Long wrapper classes.
		 * 
		 * 9.31 What is the purpose of the MIN_VALUE and MAX_VALUE
		 * variables that are members of the numeric wrapper classes?
		 * 
		 * answer: To have a way to easily access or reference what
		 * the max and min values are for each numeric data type.
		 * I would use them for input validation and to prevent 
		 * memory overflow/underflow.
		 */
	}	
}
