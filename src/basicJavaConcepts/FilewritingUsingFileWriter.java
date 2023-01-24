package basicJavaConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FilewritingUsingFileWriter {

	public static void main(String[] args) throws IOException {
		String location = "UsingFileWriter.txt";
		String content = "File writing using file writer 1";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
	}

}
