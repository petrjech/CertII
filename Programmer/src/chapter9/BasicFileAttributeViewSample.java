package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class BasicFileAttributeViewSample {

	public static void main(String[] args) throws IOException {

		Path file = Paths.get("test_dir\\test_file.txt");
		BasicFileAttributes data = Files.readAttributes(file, BasicFileAttributes.class);
		 
		System.out.println("Is path a directory? "+data.isDirectory());
		System.out.println("Is path a regular file? "+data.isRegularFile());
		System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolic link? "+ data.isOther());
		 
		System.out.println("Size (in bytes): "+data.size());
		 
		System.out.println("Creation date/time: "+data.creationTime());
		System.out.println("Last modified date/time: "+data.lastModifiedTime());
		System.out.println("Last accessed date/time: "+data.lastAccessTime());
		System.out.println("Unique file identifier (if available): "+ data.fileKey());

		BasicFileAttributeView view = Files.getFileAttributeView(file, BasicFileAttributeView.class);
		BasicFileAttributes sameData = view.readAttributes();
		System.out.println(sameData.creationTime());
		view.setTimes(FileTime.from(Instant.now()), null, null);
		System.out.println("Last modified date/time: "+view.readAttributes().lastModifiedTime());
	}
}
