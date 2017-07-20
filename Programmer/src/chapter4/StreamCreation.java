package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamCreation {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Stream<String> empty = Stream.empty();
		
		Stream<String> s1 = Stream.of("one", "two");
		
		String[] str = {"a", "b"};
		Stream<String> s2 = Stream.of(str);
		
		List<String> list = new ArrayList<>();
		Stream<String> s3 = list.stream();
		
		Supplier<String> supplier = () -> "";
		Stream<String> s4 = Stream.generate(supplier);
		
		UnaryOperator<String> unary = s -> s + "a";
		Stream<String> s5 = Stream.iterate("", unary);
		s5.limit(5).forEach(System.out::print);
	}
}
