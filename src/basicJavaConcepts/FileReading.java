package basicJavaConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		// if only one line text is present
		
		/*
		 * String location = "UsingBufferedwriter.txt"; FileReader fileReader = new
		 * FileReader(location); BufferedReader reader = new BufferedReader(fileReader);
		 * String currentLine = reader.readLine(); System.out.println(currentLine);
		 */

		
		// if multiple lines of text is present
		String location = "UsingBufferedwriter.txt";
		FileReader fileReader = new FileReader(location);
		BufferedReader reader = new BufferedReader(fileReader);
		String currentLine;
		while ((currentLine=reader.readLine())!=null) {
			
			System.out.println(currentLine);
		}
	}

}
