package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * This program tests the PasswordVerifier class. 
 * 
 * @author craig
 * 3-9-21
 * 2:40pm
 */
public class PasswordTester {
	public static void main(String[]args) {
		String password = JOptionPane.showInputDialog(null, "Enter a password "
			+ "and I'll verify that it has at least \n"
			+ "six characters, that it has an upper \n"
			+ "and lowercase letter, and that it has \n"
			+ "at least one number. I will also tell you\n"
			+ "which one of those criteria it needs if \n"
			+ "it fails.");
		
		PasswordVerifier pv = new PasswordVerifier(password);
		if(pv.isValid()) {
			JOptionPane.showMessageDialog(null, "This password is valid.");
		}
		else if(!pv.isValid()) {
			if(!pv.hasSixCharacters(password)) {
				JOptionPane.showMessageDialog(null, "This password "
					+ "doesn't have enough characters.");
			}
			if(!pv.hasUpperAndLowercase(password)) {
				JOptionPane.showMessageDialog(null, "This password "
					+ "has to have both an upper and lowercase letter.");
			}
			if(!pv.hasANumber(password)) {
				JOptionPane.showMessageDialog(null, "This password "
					+ "needs a number.");
			}
		}
		JOptionPane.showMessageDialog(null, "Thank you for using the password"
			+ " verifier!");

		System.exit(0);
	}	
}
