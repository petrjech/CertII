package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StreamReduce {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		
		BinaryOperator<String> accumulator1 = (str1, str2) -> str1.length() < str2.length() ? str2 : str1;
		list1.stream().reduce(accumulator1).ifPresent(System.out::println);

		BinaryOperator<String> accumulator2 = (s1, s2) -> s1 + " - " + s2;
		System.out.println( list1.stream().reduce("first value", accumulator2) );
		
		BiFunction<Integer, String, Integer> acumulator3 = (Integer sum, String elem) -> sum + elem.length();
		BinaryOperator<Integer> combiner3 = (Integer part1, Integer part2) -> part1 + part2;
		System.out.println( list1.stream().reduce(0, acumulator3, combiner3) );
	}

}
