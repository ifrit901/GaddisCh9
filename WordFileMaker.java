package ch9java6thedition;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
/**
 * WordFileMaker .
 * 
 * The WordFileMaker class exists to make a word file
 * that can be counted by the FileWordCounter program
 * that is my answer to #10 Word Counter problem.
 * 
 * @author craig
 * 3-26-21
 * 2:38pm
 */
public class WordFileMaker {
	private File file;
	private String string;
	private int lineNumber;
	
	public File getFile() {
		return file;
	}

	public int getLines() {
		return lineNumber;
	}
	public WordFileMaker(String str) throws IOException{ 
		File newFile = new File(str);
		PrintWriter pw = new PrintWriter(newFile);
		Random randy = new Random();
		int lines = randy.nextInt(100) + 1;
		for(int i = 0; i < lines; i++) {
			pw.println("All work and no play makes Jack a dull boy.");
		}
		pw.close();
		file = newFile;
		lineNumber = lines;
	}
}
