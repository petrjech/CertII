package chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class FileStreamSample {

	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}
	
	public static void printFile(File source) throws FileNotFoundException, IOException {
		try (Reader reader = new FileReader(source);) {
			int c;
			while( (c = reader.read()) != -1) {
				System.out.print((char) c);
			} 
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("test_dir\\test_file.txt");
		File destination = new File("test_dir\\temp");
		copy(source, destination);
		printFile(destination);
	}

}
