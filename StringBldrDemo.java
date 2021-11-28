package ch9java6thedition;

/**
 * This file contains some StringBuilder examples.
 * 
 * @author craig
 */
public class StringBldrDemo {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("Charleston");
		System.out.println(sb);

		StringBuilder str = new StringBuilder();
		str.append("We sold "); 	// Append a String object
		str.append(12);			// Append an int
		str.append(" doughnuts for $"); // Append another String
		str.append(15.97);		// Append a double
		System.out.println(str);

		StringBuilder city = new StringBuilder("New City");
		city.insert(4, "York ");
		System.out.println(city);

		char []  cArray = {'2', '0', ' '};
		StringBuilder str1 = new StringBuilder("In July we sold cars.");
		str1.insert(16, cArray);
		System.out.println(str1);
		
		StringBuilder str2 = new StringBuilder("We moved from Chicago to Atlanta.");
		str2.replace(14, 21, "New York");
		System.out.println(str2);

		StringBuilder str3 = new StringBuilder("I ate 100 blueberries!");

		// Display the StringBuilder object
		System.out.println(str3);

		// Delete the '0'
		str3.deleteCharAt(8);

		// Delete "blue"
		str3.delete(9, 13);  

		// Display the StringBuilder object
		System.out.println(str3);

		// Change the 1 to a 5
		str.setCharAt(6, '5');

		// Display the StringBuilder object
		System.out.println(str3);

		
	}	
}
