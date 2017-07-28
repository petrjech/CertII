package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamCreation {
	
	private static String staticString = "static";
	private String instanceString = "instance";
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Stream<String> empty = Stream.empty();
		
		Stream<String> s1 = Stream.of("one", "two");
		
		String[] str = {"a", "b"};
		Stream<String> s2 = Stream.of(str);
		
		List<String> list = new ArrayList<>();
		Stream<String> s3 = list.stream();
		
		Supplier<String> supplier = () -> {staticString += staticString.length(); return staticString;};
		Stream<String> s4 = Stream.generate(supplier);
		s4.limit(2).forEach(System.out::print);
		
		System.out.println();
		
		StreamCreation sc = new StreamCreation();
		UnaryOperator<String> unary = s -> s + "a";
		Stream<String> s5 = Stream.iterate(sc.instanceString, unary);
		s5.limit(2).forEach(System.out::print);
	}
}
