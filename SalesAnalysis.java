package ch9java6thedition;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * 11. Sales Analysis
 * 
 * The file 'SalesData.txt' in this chapters source code folder contains
 * the dollar amount of sales that a retail store made each day for
 * a number of weeks. Each line in the file contains seven numbers, 
 * which are the sales numbers for one week. The numbers are 
 * separated by a comma. The following line is an example from the
 * file:
 * 
 * 	2541.36,2965.88,1965.32,1845.23,7021.11,9652.74,1469.36
 * 
 * Write a program that opens the file and processes its contents. The 
 * program should display the following:
 * 
 * - The total sales for each week
 * - The average daily sales for each week
 * - The total sales for all of the weeks
 * - The average weekly sales
 * - The week number that had the highest amount of sales
 * - The week number that had the lowest amount of sales
 * 
 * @author craig
 * 4-1-21
 * 8:53am
 * On the ambulance with Johnny Tan
 */
public class SalesAnalysis {
	public static void main (String[]args) throws IOException{
		double week1Total = 0;
		double week2Total = 0;
		double week3Total = 0;
		double week4Total = 0;
		double weeklyAverage = 0;
		double week1DailyAverage = 0;
		double week2DailyAverage = 0;
		double week3DailyAverage = 0;
		double week4DailyAverage = 0;
		double monthlyTotal = 0;

		// Get a file name from the user 
		String inputFile = JOptionPane.showInputDialog(null, "Enter the name of a file that contains"
			+ " sales data for several weeks.");
			
		// Create a file object to represent the file
		File file = new File(inputFile);

		// Create a text file using a modification of the WordFileMaker class
		// from the previous challenge
		salesFileMaker(inputFile);

		// Open a Scanner to read from the file
		Scanner fileReader = new Scanner(file);	

		while(fileReader.hasNextLine()) {
			String [] array = fileReader.nextLine().split(",");
			for(String s : array) {
				monthlyTotal += Double.parseDouble(s);
			}
		}	

		Scanner fileReader2 = new Scanner(file);

		String [] week1 = fileReader2.nextLine().split(",");
		double week1Average = 0; 
		for(String s : week1) {
			week1Total+= Double.parseDouble(s);
		}
		week1DailyAverage = week1Total / 7;

		String [] week2 = fileReader2.nextLine().split(",");
		double week2Average = 0; 
		for(String s : week2) {
			week2Total+= Double.parseDouble(s);
		}
		week2DailyAverage = week2Total / 7;

		String [] week3 = fileReader2.nextLine().split(",");
		double week3Average = 0; 
		for(String s : week3) {
			week3Total += Double.parseDouble(s);
		}
		
		week3DailyAverage = week3Total / 7;
		String [] week4 = fileReader2.nextLine().split(",");
		double week4Average = 0; 
		for(String s : week4) {
			week4Total += Double.parseDouble(s);
		}
		week4DailyAverage = week4Total / 7;

		weeklyAverage = (week1Total + week2Total + week3Total + week4Total) / 4;

		fileReader.close();

		// Display results

		// The total sales for each week
		JOptionPane.showMessageDialog(null, "The total sales for each week were:" +
			String.format("\nWeek 1: $%,.2f", week1Total) +
			String.format("\nWeek 2: $%,.2f", week2Total) +
			String.format("\nWeek 3: $%,.2f", week3Total) + 
			String.format("\nWeek 4: $%,.2f", week4Total));
			 
		// The average daily sales for each week
		JOptionPane.showMessageDialog(null, "The average daily sales for each week were: " +
			String.format("\nWeek 1: $%,.2f", week1DailyAverage) +
			String.format("\nWeek 2: $%,.2f", week2DailyAverage) +
			String.format("\nWeek 3: $%,.2f", week3DailyAverage) +
			String.format("\nWeek 4: $%,.2f", week4DailyAverage));
		// The total sales for all the weeks
		JOptionPane.showMessageDialog(null, "The monthly total for all the weeks was " + 
			String.format("$%,.2f", monthlyTotal));

		// The average weekly sales
		JOptionPane.showMessageDialog(null, "The weekly average was " +
			String.format("$%,.2f", weeklyAverage));

		double [] totals = {week1Total, week2Total, week3Total, week4Total};
		double highestWeek = week1Total;
		for(int i = 1; i < totals.length; i++) {
			if(totals[i] > highestWeek) 
				highestWeek = totals[i];
		}
		double lowestWeek = week1Total;
		for(int i = 1; i < totals.length; i++) {
			if(totals[i] < lowestWeek)
				lowestWeek = totals[i];
		}

		JOptionPane.showMessageDialog(null, "The week with the highest sales was "
			+ "week " + String.format("$%,.2f", highestWeek));

		JOptionPane.showMessageDialog(null, "The week with the lowest sales was "
			+ "week " + String.format("$%,.2f", lowestWeek));		

		System.exit(0);
	}
		

public static File salesFileMaker(String str) throws IOException{
	PrintWriter pw = new PrintWriter(str);
	DecimalFormat df = new DecimalFormat("####.##");
	Random randy = new Random();
	for(int i = 0; i < 4; i++) {
		for(int p = 0; p < 7; p++) {
			pw.print(df.format(randy.nextDouble() * 10000)+ ",");
		}		
		pw.println();
	}	
	pw.close();
	File file = new File(str);

	return file;
	}	
}

