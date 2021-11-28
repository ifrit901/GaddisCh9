package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 1. Backward String 
 * 
 * Write a method that accepts a String object as an argument and 
 * displays its contents backwards. For instance, if the string 
 * argument is "gravity", the method should display - "ytivarg". 
 * Demonstrate the method in a program that asks the user to enter 
 * a string and passes it to the method.
 * 
 * @author craig
 * 2-26-21
 * 7:33am
 */
public class BackwardString {
	public static void main(String[]args) {
		String input;
		input = JOptionPane.showInputDialog(null, "Enter a string and "
			+ "I'll return it backwards:");
		JOptionPane.showMessageDialog(null, switchARoo(input));
	}	

	public static String switchARoo(String str) {
		StringBuilder reverse = new StringBuilder();
		for(int i = str.length() -1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		String newString = reverse.toString();
		return newString;
	}
}
