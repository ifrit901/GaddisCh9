package ch9java6thedition;
import java.util.Scanner;
/**
 *
 * @author craig
 */
public class ToChar {
	public static void main(String[]args) {
		String str; 

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String to get char arrayed:");
		str = input.nextLine();

		char [] charArray = new char[str.length()];

		charArray = str.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}
	}	
}
