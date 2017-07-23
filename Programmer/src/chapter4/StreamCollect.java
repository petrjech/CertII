package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCollect {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		
		Supplier<StringBuilder> supplier2 = () -> new StringBuilder();
		BiConsumer<StringBuilder, String> accumulator2 = (sb, str) -> sb.append(str);
		BiConsumer<StringBuilder, StringBuilder> combiner2 = (sb1, sb2) -> sb1.append(sb2);
		System.out.println( list1.stream().collect(supplier2, accumulator2, combiner2).toString() );
		
		System.out.println( list1.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString() );
		
		Collector<String, ?, Set<String>> collector1 = Collectors.toSet();
		System.out.println( list1.stream().collect(collector1) );
		
		System.out.println( list1.stream().collect(Collectors.toSet()) );
		
		System.out.println( list1.stream().collect(Collectors.toCollection(() -> new TreeSet<>())) );
		
		System.out.println( list1.stream().collect(Collectors.toList()) );
		
		System.out.println( list1.stream().collect(Collectors.toMap(str -> str.hashCode(), str -> str)) );
	}

}
