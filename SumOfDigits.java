package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 9. Sum of Digits in a String
 * 
 * Write a program that asks the user to enter a series of single digit
 * numbers with nothing separating them. The program should display
 * the sum of all the single digit numbers in the string. For example, 
 * if the user enters 2514, the method should return 12, which is the 
 * sum of 2, 5, 1, and 4. (Hint: convert the string to an array). 
 * 
 * @author craig
 * 3-26-21
 * 11:05am
 */
public class SumOfDigits {
	public static void main(String[]args) {
		String input = JOptionPane.showInputDialog(null, "Enter a series of single digit "
			+ "numbers with no spaces or anything \nseparating them and I'll "
			+ "calculate their sum:");

		int total = 0;
		char [] array = input.toCharArray();

		for(int i = 0; i < array.length; i++) {
			/*
			It took me forever to figure out 
			Character.getNumericValue()
			was the correct method
			*/
			total += Character.getNumericValue(array[i]);
		}

		JOptionPane.showMessageDialog(null, "The sum of all those single digit numbers "
			+ "is " +  total);

		System.exit(0);
	}
}