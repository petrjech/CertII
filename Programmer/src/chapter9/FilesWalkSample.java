package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesWalkSample {

	public static void main(String[] args) throws IOException {

		Path dir = Paths.get(".");
		
		Files.list(dir).forEach(System.out::println);
		Files.walk(dir).filter(p -> Files.isRegularFile(p) && p.getFileName().toString().endsWith(".java")).forEach(System.out::println);
		System.out.println(Files.find(dir, Integer.MAX_VALUE, (path, attributes) -> attributes.isRegularFile() && path.getFileName().toString().endsWith(".java")).count());
		

	}

}
