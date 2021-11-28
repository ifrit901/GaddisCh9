package ch9java6thedition;

/**
 * This is the beginning of chapter 9.
 * @author craig
 */
public class Ch9java6thEdition {
	public static void main(String[] args) {
		String str = "AberaCaDabera";
		int i = 0;
		int bigLetters = 0;

		while(i < str.length()) {
			if(Character.isUpperCase(str.charAt(i)))
				bigLetters += 1;
			i++;
		}
		
		System.out.println("There are " + bigLetters + " capital letters "
			+ "in " + str);
	}
	
}
