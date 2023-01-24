package basicJavaConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilewritingUsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		String location = "UsingBufferedwriter.txt";
		String content = "File writing using buffered writer";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();

	}

}
