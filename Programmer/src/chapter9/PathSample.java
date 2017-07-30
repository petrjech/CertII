package chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {

	public static void main(String[] args) {

		Path path1 = Paths.get("test_dir/test_file.txt");
		Path path2 = Paths.get("test_dir", "test_file.txt");
		Path path3 = Paths.get("test_dir", "abc", "..", "test_file.txt");
		Path path4 = Paths.get("test_dir");
		
		System.out.println(path1);
		System.out.println(path2.getParent());
		System.out.println(path3.toAbsolutePath());
		System.out.println(path3.getNameCount());
		System.out.println(path1.getName(0));
		System.out.println(path3.normalize());
		System.out.println(path4.getFileName());
		System.out.println(path4.getRoot());
		System.out.println(path4.toAbsolutePath().getRoot());
		System.out.println("Is absolute " + path1 + " :" + path1.isAbsolute());
		System.out.println(path1.subpath(0, 1));
	}

}
