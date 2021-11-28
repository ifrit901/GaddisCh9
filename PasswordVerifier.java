package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * 5. Password Verifier
 * 
 * Imagine you are developing a software package for Amazon.com 
 * that requires users to enter their own passwords. Your software
 * requires that user's passwords meet the following criteria:
 * 
 * - The password has to be six characters long.
 * - The password should contain at least one uppercase
 *   and one lowercase letter.
 * - The password should have at least one number.
 * 
 * Write a class that verifies that a password meets the stated criteria. 
 * Demonstrate the class in a program that asks the user to enter a 
 * password and then displays a message indicating whether it is valid 
 * or not. 
 * 
 * @author craig
 * 3-9-21
 * 9:25am
 */
public class PasswordVerifier {
	private final String password;

	public PasswordVerifier(String str) {
		password = str;
	} 

	public boolean isValid() {
		boolean isValid = false;

		if(hasSixCharacters(password) && 
		   hasUpperAndLowercase(password) &&
		   hasANumber(password)) {
			isValid = true;
		}
		return isValid;
	}

	public boolean hasSixCharacters(String str) {
		boolean hasSix = false;
		if(str.length() >= 6) {
			hasSix = true;
		}
		return hasSix;
	}

	public boolean hasUpperAndLowercase(String str) {
		boolean hasUp = false;
		boolean hasDown = false;
		boolean hasItAll = false;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				hasUp = true;
			}
			if(Character.isLowerCase(str.charAt(i))) {
				hasDown = true;
			}
		}
		if(hasUp && hasDown) {
			hasItAll = true;
		}
		return hasItAll;
	}

	public boolean hasANumber(String str) {
		boolean hasNum = false;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				hasNum = true;	
			}
		}
		return hasNum;
	}
}
