package basicJavaConcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritingUsingPath {

	public static void main(String[] args) throws IOException {
		String location = "UsingPath.txt";
		String content = "File writing using Path";
		
		Path path = Paths.get(location);
	    Files.write(path, content.getBytes());
		

	}

}
