package chapter4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamsTerminals {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		
		System.out.println(list1.stream().count());

		list1.stream().forEach(System.out::println);
		
		list1.stream().findFirst().ifPresent(System.out::println);
		
		Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
		list1.stream().max(comp).ifPresent(System.out::println);
		
		Predicate<String> pred = s -> s.length() < 4; 
		System.out.println( list1.stream().allMatch(pred) );
		System.out.println( list1.stream().anyMatch(pred) );
		System.out.println( list1.stream().noneMatch( s -> s.isEmpty() ) );

		// TODO collect()
		// TODO reduce() 
	}

}
