package ch9java6thedition;

/**
 * This is check point number 9.1 - 9.6.
 * 
 * @author craig
 * 2-12-21
 * 2:32pm
 */
public class CheckPoint9_1 {
	/**
	 * 9.1 Write a statement that converts the contents of the 
	 *     char variable 'big' to lower case. The converted 
	 *     value should be stored in the variable little.
	 * 
	 * answer: little = Character.toUpperCase(big);
	 * 
	 * 9.2 Write an if statement that displays the word "digit"
	 *     if the char variable 'ch' contains a numeric digit. 
	 *     Otherwise, it should display "not a digit." 
	 * 
	 * answer: if(Character.isDigit(ch))
	 * 		System.out.println("digit");
	 * 	   else
	 * 		System.out.println("not a digit");
	 * 
	 * 9.3 What is the output of the following statement? 
	 * 	System.out.println(Character.toUpperCase(Character.toLowerCase('A')));
	 * 
	 * answer: the statement should print "A".
	 * 
	 * 9.4 Write a loop that asks the user, "Do you want to repeat the program 
	 *     or quit? (R/Q)" The loop should repeat until the user enters R or Q
	 *     (either upper case or lower case)
	 * 
	 * answer: // This answer lets the loop repeat until 'q' is entered. 
	 *  		char answer; 
	 * 		Scanner input = new Scanner(System.in);	
	 * 		String str;
	 * 		while(Character.toUppercase(answer) != 'Q')
	 * 		{
	 * 			System.out.println("Do you want to repeat the program? R or Q");
	 * 			str = input.nextLine();
	 * 			answer = str.charAt(0);		
	 *    		} 
	 * 
	 * 9.5 What will the following code display? 
	 * 	char var = '$';
	 * 	System.out.println(Character.toUpperCase(var));
	 * 
	 * answer: It will display '$'.
	 * 
	 * 9.6 Write a loop that counts the number of upper case characters
	 *     that appear in the String object 'str'. 
	 * 
	 * 	String str = "AberaCaDabera";
	 * 	int i = 0;
	 * 	int bigLetters = 0;
	 * 
	 * 	while(i < str.length()) {                                     >
	 *		if(Character.isUpperCase(str.charAt(0))) {
	 * 			bigLetters += 1;
	 * 		}
	 * 	}
	 * 
	 * 
	 * 	
	 */	
}
