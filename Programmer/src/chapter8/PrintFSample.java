package chapter8;

public class PrintFSample {

	public static void main(String[] args) {
		
		int i = 1234;
		
		System.out.format("int is %d and newline %n", i);
		System.out.printf("int is %d and newline %n", i);
		
		System.out.printf("float or double is %f and newline %n", Math.PI);
		
		System.out.printf("strings are %s and %s and %s %n", "test1", "test2", "test3");
		
		System.out.printf("strings and numbers %s %d %s %n", "test1", 1234, "test2");
	}
}
