package ch9java6thedition;
import java.util.Scanner;
/**
 * This class will contain some methods and arrays to help form 
 * the simulated check mentioned in Programming Challenge 
 * #7. 
 * 
 * @author craig
 * 3-13-21
 * 6:44am
 * On B2021 with Colin R.
 * Maria is with Carlos on B2011
 */
public class CheckWriter {
	private static final String [] ones = {"Zero", "One", "Two", "Three", "Four",
			      "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			      "Eleven", "Twelve", "Thirteen", "Fourteen", 
			      "Fifteen", "Sixteen", "Seventeen", "Eighteen", 
			      "Nineteen"};

	private static final String [] tens = {"", "Ten", "Twenty", "Thirty", "Fourty",
			     "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	private String name;
	private String date;
	private double amount;
	private String amountString;
	
	// Convert less than one thousand
	private static String Converts(int number) {
		String favor;
		if(number % 100 < 20) {
			favor = ones[number % 100];
			number /= 100;
		}
		else {
			favor = ones[number % 10];
			number /= 10;
			favor = tens[number % 10]  + favor;
			number /= 10;
		}

		if(number == 0) 
			return favor;
		return ones[number] + " hundred " + favor;
	} 

	// Display output
	private void display() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("                                                        Date: " + date);
		System.out.println(" Pay to the Order of:     " + name + " $" + amount);
		
	}

	public CheckWriter(String name, String date, double amount) {
		this.name = name;
		this.date = date;
		this.amount = amount;
	}

	public String getName() {
		return name.toString();
	}

	public String getDate() {
		return date.toString();
	}

	public String getAmount() {
		return String.valueOf(amount);
	}
	
	public String wordAmount(String amount) {
		String sentenceNumber = "";
		char [] numberSplit = amount.toCharArray();
		for(int i = 0; i < numberSplit.length; i++) {
			sentenceNumber += numToWord(numberSplit[i]) + " ";
			if(i == 0)
				sentenceNumber += "thousand ";
			else if(i == 1)
				sentenceNumber += "hundred ";
			else if(i == numberSplit.length -1)
				sentenceNumber += "dollars.";
		}
		return sentenceNumber;
	}

	public String numToWord(char c) {
		String num = "";		
		if(c == '0')
			num = "Zero";
		else if(c == '1')
			num = "One";
		else if(c == '2')
			num = "Two";
		else if(c == '3')
			num = "Three";
		else if(c == '4')
			num = "Four";
		else if(c == '5')
			num = "Five";
		else if(c == '6')
			num = "Six";
		else if(c == '7')
			num = "Seven";
		else if(c == '8')
			num = "Eight";
		else if(c == '9')
			num = "Nine";

		return num;
	}
}
