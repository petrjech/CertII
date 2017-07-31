package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class FileOwnerShipSample {

	public static void main(String[] args) throws IOException {

		Path file = Paths.get("test_dir\\test_file.txt");
		UserPrincipal user = Files.getOwner(file);
		System.out.println(user.getName());
		System.out.println(user);
		System.out.println(Files.setOwner(file, user));

	}

}
