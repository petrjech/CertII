package chapter4;

import java.util.ArrayList;
import java.util.List;

public class StreamIntermediate {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("two");
		list1.add("four");
		
		list1.stream().filter( str -> str.startsWith("t") ).forEach(System.out::print);
		System.out.println();

		list1.stream().distinct().forEach(System.out::print);
		System.out.println();
		
		list1.stream().skip(2).limit(1).forEach(System.out::print);
		System.out.println();
		
		list1.stream().map(s -> s.startsWith("t")).forEach(System.out::print);
		System.out.println();

		List<List<String>> list2 = new ArrayList<>();
		list2.add(list1);
		list2.add(list1);
		list2.stream().flatMap(subList -> subList.stream()).forEach(System.out::print);
		System.out.println();
		
		list1.stream().sorted().forEach(System.out::print);
		System.out.println();
		
		list1.stream().sorted( (s1, s2) -> s1.length() - s2.length() ).forEach(System.out::print);
		System.out.println();
		
		list1.stream().peek( (s) -> System.out.print("*") ).forEach(System.out::print);
		System.out.println();
	}
}
