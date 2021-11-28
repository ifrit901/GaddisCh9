package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 6. Tele-marketing Phone Number List
 * 
 * Write a program that has two parallel arrays of String objects.
 * One of the arrays should hold people's names, the other should 
 * hold their phone numbers. Here are example contents of both
 * arrays:
 * 
 * 	name Array Example Contents 	phone Array Example Contents
 * 	    "Harrison, Rose"			"555-2234"
 * 	    "James, Jean" 			"555-9089"
 * 	    "Smith, William" 			"555-1785"
 * 	    "Smith, Brad" 			"555-9224"
 * 
 * The program should ask the user to enter a name or the first
 * few characters of a name to search for in an array. The 
 * program should display all of the names that match the user's
 * input and their corresponding numbers. For example, if the user
 * enters "Smith", the program should display the following names
 * and phone numbers from the list:
 * 
 * 	Smith, William: 555-1785
 * 	Smith, Brad: 555-9224
 * @author craig
 * 3-10-21
 * 10:15am
 * With Maria
 */
public class PhoneNumbers {
	public static void main(String[]args) {
		String input;
		String output = "";
		String [] names = {"Harrison, Rose", "James, Jean", 
				   "Smith, William", "Smith, Brad"};

		String [] numbers = {"555-2234", "555-9089", 
				     "555-1785", "555-9224"};
		input = JOptionPane.showInputDialog(null, "Enter a name or the "
			+ "first few characters of a name to search for: ");

		for(int i = 0; i < names.length; i++) {
			if(names[i].startsWith(input)) {
				output += names[i] + ": " + numbers[i] + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, "The name(s) I found are: \n" + output);
	}	
}
