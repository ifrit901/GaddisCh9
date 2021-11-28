package ch9java6thedition;
import java.util.Scanner;
/**
 *
 * @author craig
 */
public class CharArray {
	public static void main(String[]args) {
		String [] numbers = {"zero", "one", "two", "three", "four", "five"}; 
		String nums;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number and I'll convert it to a sentence:");
		nums = input.nextLine();
		char[]num = nums.toCharArray();
		String sentence = "";
		
		for(int i = 0; i < num.length; i++) {
			{	
				if(num[i] == '0') 
					sentence += "Zero ";
				else if(num[i] == '1') 
					sentence += "One ";
				else if(num[i] == '2')
					sentence += "Two ";
				else if(num[i] == '3')
					sentence += "Three ";
				else if(num[i] == '4') 
					sentence += "Four ";
				else if(num[i] == '5')
					sentence += "Five ";
			}	
		}
		sentence += "dollars";
		System.out.println(sentence);
	}
}	

