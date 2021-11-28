package ch9java6thedition;
import java.io.*;	// Needed for IOException
/**
 * This is code listing 9.10. It uses the TestScoreReader
 * class to average some test scores.
 * 
 * @author craig
 * 2-24-21
 * 8:52pm
 */
public class TestAverages {
	public static void main(String[]args) throws IOException{
		double average;		// Test average
		int studentNumber = 1;	// Control variable

		// Create a TestScoreReader object
		TestScoreReader tsr = new TestScoreReader("/home/craig/NetBeansProjects/Ch9java6thEdition/src/ch9java6thedition/Grades.csv");

		// Display the averages
		while(tsr.readNextLine()) {
			// Get the average from the TestScoreReader object
			average = tsr.getAverage();

			System.out.println("The average for student number " +
				studentNumber + " is " + average);

			// Increment the student number
			studentNumber++;
		}

		// Close the TestScoreReader
		tsr.close();
	}	
}
