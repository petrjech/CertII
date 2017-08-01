package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesLinesStreamSample {
	
	int counter = 0;

	public static void main(String[] args) throws IOException {

		FilesLinesStreamSample fls = new FilesLinesStreamSample();
		Path file = Paths.get("test_dir\\test_file.txt");
		Files.lines(file).forEach( line -> { fls.counter += 1; System.out.println(fls.counter + " - " + line); } );
	}

}
