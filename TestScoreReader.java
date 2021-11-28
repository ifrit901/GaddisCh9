package ch9java6thedition;
import java.io.*;
import java.util.Scanner;

/**
 * This is code listing 9.9, the TestScoreReader class.
 * It can process text files from Excel spreadsheets
 * exported with .csv file extensions.
 * 
 * @author craig
 * 2-23-21
 * 5:19pm
 */
public class TestScoreReader {
	/*
	The TestScoreReader class reads test scores as 
	tokens from a file and calculates the average
	of each line of scores.
	*/	

	private Scanner inputFile;
	private String line;

	/**
	 * The constructor opens a file to be 
	 * read from.
	 * @param filename The file to be read from.
	 */
	public TestScoreReader(String filename) throws IOException{
		File file = new File(filename);
		inputFile = new Scanner(file);
	}

	/**
	 * The readNextLine method reads the next line in 
	 * the file. It returns 	 
	 * @return true if the line was read,
	 * false otherwise.
	 */
	public boolean readNextLine() throws IOException{
		boolean gotRead; 	// Flag variable

		// Determine whether there is a line to read
		gotRead = inputFile.hasNext();

		// If so, read the next line
		if(gotRead) {
			line = inputFile.nextLine();
		}

		return gotRead;
	}	

	/**
	 * The getAverage method calculates the average of the last 
	 * line of test scores read from the file.
	 * @return The average.
	 */
	public double getAverage() {
		int total = 0; 		// Accumulator
		double average;		// The average test score
		
		String [] tokens = line.split(",");

		for(String str : tokens) {
			total += Integer.parseInt(str);
		}

		// Calculate the average of the line
		// Cast total to double to avoid integer division
		average = (double)total / tokens.length;

		return average;
	}

	/**
	 * The close method closes the file.
	 */
	public void close() {
		inputFile.close();
	}
}
