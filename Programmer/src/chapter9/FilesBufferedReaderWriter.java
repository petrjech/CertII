package chapter9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesBufferedReaderWriter {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("test_dir\\test_file.txt");
		Path path2 = Paths.get("test_dir\\test_copy.txt");
		List<String> content = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("UTF-8"))) {
			String currentLine = null;
			while ((currentLine = reader.readLine()) != null) {
				System.out.println(currentLine);
				content.add(currentLine + " // copied");
			}
		}
		try (BufferedWriter writer = Files.newBufferedWriter(path2, Charset.forName("UTF-16"))) {
			for (String line: content) {
				writer.write(line);
				writer.newLine();
			}
		}
		content.clear();
		content = Files.readAllLines(path2, Charset.forName("UTF-16"));
		Files.deleteIfExists(path2);
		content.forEach(System.out::println);
	}
}
