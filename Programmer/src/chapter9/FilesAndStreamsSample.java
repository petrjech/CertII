package chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesAndStreamsSample {

	public static void main(String[] args) {

		try (InputStream is = new FileInputStream("test_dir\\test_file.txt");
				OutputStream out = new FileOutputStream("test_dir\\temp2")) {

			System.out.println(Files.copy(is, Paths.get("test_dir\\temp1")));
			System.out.println(Files.copy(Paths.get("test_dir\\temp1"), out));


		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		try {

			System.out.println(Files.deleteIfExists(Paths.get("test_dir\\temp1")));
			System.out.println(Files.deleteIfExists(Paths.get("test_dir\\temp2")));

		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
}
