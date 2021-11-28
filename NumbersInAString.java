package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 8. Numbers in a String 
 * Write a program that asks the user to enter a series of numbers separated by commas.
 * Here is an example of valid input:
 * 
 * 	7,9,10,2,18,6
 * 
 * The program should calculate and display the sum of all the numbers.
 * 
 * @author craig
 * 3-26-21
 * 9:45am
 */
public class NumbersInAString {
	public static void main(String[]args) {
		String input = JOptionPane.showInputDialog(null, "Enter a series of numbers "
			+ "divided by commas:");
		int total = 0;
		String [] array = input.split(",");
		for(String s : array) {
			total += Integer.valueOf(s);
		}

		JOptionPane.showMessageDialog(null, "The value of all those integers added"
			+ " together is " + total);
		System.exit(0);
	}	
}
