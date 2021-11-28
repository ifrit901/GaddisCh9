package ch9java6thedition;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * 10. File Word Counter
 * 
 * Write a program that asks the user for the name of a file.
 * The program should display the number of words the 
 * file contains.
 * 
 * @author craig
 * 3-26-21
 * 2:31pm
 */
public class FileWordCounter {
	public static void main(String[]args) throws IOException{
		String fileName = JOptionPane.showInputDialog("Enter the name of a file, "
			+ "I'll create the file with \na certain number of words. I'll count"
			+ "the number of words in the file and \n tell you how many "
			+ "there are.");
		WordFileMaker wfm = new WordFileMaker(fileName);
		
		JOptionPane.showMessageDialog(null, "The number of words in the file is "
			+  WordCount(wfm.getFile()));
		Scanner outputFile = new Scanner(wfm.getFile());
		System.out.println(wfm.getLines());
		while (outputFile.hasNextLine()) {
			System.out.println(outputFile.nextLine());
		}
	}	
	public static int WordCount(File file) throws IOException{
		int werds = 0;
		String line;
		String [] array;
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			line = input.nextLine();
			array = line.split(" ");
			werds += array.length;
		}

		return werds;
	}
}
