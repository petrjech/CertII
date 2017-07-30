package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSampleII {

	public static void main(String[] args) throws IOException {

		Path pathRel = Paths.get("test_dir\\test_file.txt");
		Path pathSymLink1 = Paths.get(".\\link");
		Path pathSymLink2 = Paths.get("link");
		
		System.out.println(pathRel.toRealPath());
		System.out.println(pathSymLink1.toRealPath());
		System.out.println(pathSymLink2.toRealPath());
		System.out.println(pathSymLink2.toRealPath(LinkOption.NOFOLLOW_LINKS));	
		
		System.out.println(Files.exists(pathRel));
		System.out.println(Files.exists(Paths.get("non existant path")));
		
		System.out.println(Files.isSameFile(Paths.get("non existent"), Paths.get("non existent")));
		System.out.println(Files.isSameFile(pathRel, pathSymLink2));
	}

}
