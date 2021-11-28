package ch9java6thedition;
import java.util.Scanner;
/**
 * 8. Sum of Numbers in a String 
 * 
 * Write a program that asks the user to enter a series of numbers 
 * separated by commas. Here is an example of valid input:
 * 
 * 	7, 9, 10, 2, 18, 6
 * 
 * The program should calculate and display the sum of all the numbers.
 * 
 * @author craig
 */
public class NumberSum {
	public static void main(String[]args) {
		String numSeries;
		String nums;
		String [] numbers;
		int total = 0;

		System.out.println("Enter a series of numbers separated by commas"
			+ " and I'll add them together.");

		Scanner input = new Scanner(System.in);
		numSeries = input.nextLine();
		numbers = numSeries.split(",");
		String newNumbers = "";
		for(int i = 0; i < numbers.length; i++) {
			newNumbers += numbers[i];
		}
		char [] array = newNumbers.toCharArray();

		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}

		System.out.println("The total of the numbers you entered is " + total);
	}		
}
