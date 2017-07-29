package chapter7;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamSample {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("one", "two", "three", "four");
		
		list1.stream().forEach(System.out::print);
		
		System.out.println();
		
		list1.parallelStream().forEach(System.out::print);
		
		System.out.println();
		
		list1.parallelStream().forEachOrdered(System.out::print);
	}

}
