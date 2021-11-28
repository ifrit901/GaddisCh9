package ch9java6thedition;

/**
 * This is the Morse Code Translator class to be used 
 * with chapter 9 programming challenge #16.
 * 
 * @author craig
 */
public class MorseCodeTranslator {
	private String str;	
	private char [] characters = {' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' ,'J', 'K', 'L', 'M', 'N', 
			            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};		

			         // space, comma, period, ?, 0, 1, 2, 3
	private String [] morsels = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", 
			         // 4, 5, 6, 7, 8, 9, A, B
			          "....-", ".....", "-....", "--...", "---..", "----.", ".-", "-...", 
			         // C, D, E, F, G, H, I, J, K
			          "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", 
	 		         // L, M, N, O, P
			          ".-..", "--", "-.", "---", ".--.",
			         // Q, R, S
			          "--.-", ".-.", "...", 
			         // T, U, V
			          "-", "..-", "...-",
			         // W, X, Y, Z
			          ".--", "-..-", "-.--", "--.."};	

	public MorseCodeTranslator(String str) {
		this.str = str;
	}
	public String translate() {
		char [] array = str.toCharArray();
		String morseCode = "";
		StringBuilder stbr = new StringBuilder();
		for(char s : array) {
			for(int i = 0; i < characters.length; i++) {
				if(Character.toUpperCase(s) == characters[i]) {
					stbr.append(morsels[i]);
				}
			}	
		}
		morseCode = stbr.toString();
		return morseCode;
	}
}
