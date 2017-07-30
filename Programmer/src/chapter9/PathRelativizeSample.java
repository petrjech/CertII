package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativizeSample {

	public static void main(String[] args) {

		Path pathRel1 = Paths.get("test_dit\\test_file.txt");
		Path pathRel2 = Paths.get("test_dir\\abc\\test.txt");
		Path pathRel3 = Paths.get("xyz\\temp");
		
		Path pathAbs1 = pathRel1.toAbsolutePath();
		Path pathAbs2 = pathRel2.toAbsolutePath();
		Path pathAbs3 = Paths.get("C:\\temp\\opq");
		
		System.out.println(pathRel1.relativize(pathRel2));
		System.out.println(pathRel1.relativize(pathRel3));
		System.out.println(pathAbs1.relativize(pathAbs2));
		try {
			System.out.println(pathRel1.relativize(pathAbs1));
		} catch (IllegalArgumentException e) {
			e.printStackTrace(System.out);
		}
		try {
			System.out.println(pathAbs1.relativize(pathAbs3));
		} catch (IllegalArgumentException e) {
			e.printStackTrace(System.out);
		}
		try {
			System.out.println(pathAbs1.relativize(pathRel1));
		} catch (IllegalArgumentException e) {
			e.printStackTrace(System.out);		
		}
	}
}
