package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class FileAttributesSample {

	public static void main(String[] args) {

		Path dir = Paths.get("test_dir");
		Path link = Paths.get("link");
		Path file = Paths.get("test_dir\\test_file.txt");
		
		System.out.println( Files.isDirectory(dir) );
		System.out.println( Files.isRegularFile(file) );
		System.out.println( Files.isRegularFile(link) );
		System.out.println( Files.isSymbolicLink(link) );
				
		try {
			System.out.println( Files.isHidden(file) );
			System.out.println( Files.isReadable(file) );
			System.out.println( Files.isExecutable(file) );
			System.out.println( Files.size(file) );
			FileTime ft = Files.getLastModifiedTime(file);
			Files.setLastModifiedTime(file, ft);
			System.out.println( ft );
			System.out.println( ft.toInstant() );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
