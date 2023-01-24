package basicJavaConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingUsingFOS {

	public static void main(String[] args) throws IOException {
		String location = "UsingFOS.txt";
		String content = "File writing using File Output Stream";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writethis = content.getBytes();
		outputStream.write(writethis);
		outputStream.close();

	}

}
