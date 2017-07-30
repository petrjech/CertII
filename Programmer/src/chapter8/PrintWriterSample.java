package chapter8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterSample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("test of toString");

		try (PrintWriter out = new PrintWriter("test_dir\\temp");) {
			out.print(5); 					// PrintWriter method
			out.write(String.valueOf(5)); 	// Writer method
			out.print(2.0); 				// PrintWriter method
			out.write(String.valueOf(2.0)); // Writer method
			out.print(sb); 					// PrintWriter method
		} catch (FileNotFoundException e) {}
	}
}
