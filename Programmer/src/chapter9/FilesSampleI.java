package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesSampleI {

	public static void main(String[] args) throws IOException {

		Path pathDir1 = Paths.get("test_dir\\a1");
		Path pathDir2 = Paths.get("test_dir\\b1\\b2\\b3");
		
		System.out.println(Files.createDirectory(pathDir1));
		Files.delete(pathDir1);
		
		System.out.println(Files.createDirectories(pathDir2));
		for (int i = 4; i > 1; i += -1 ) {
			System.out.println(Files.deleteIfExists(pathDir2.subpath(0, i)));
		}
		
		Path file1 = Paths.get("test_dir\\test_file.txt");
		Path file2 = Paths.get("test_dir\\temp");
		Path file3 = Paths.get("test_dir\\temp2");
		System.out.println( Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING));		
		System.out.println(Files.move(file2, file3));
		Files.delete(file3);
	}

}
