package chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DoubleColon {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {

		//static method
		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = System.out::println;
		
		//instance method 1
		String myString = "abc";
		Predicate<String> p1 = s -> myString.startsWith(s);
		Predicate<String> p2 = myString::startsWith; 
		
		Map<String, String> map = new HashMap<>();
		BiConsumer<String, String> bc1 = (k, v) -> map.put(k, v);
		BiConsumer<String, String> bc2 = map::put;		
		
		Function<String, Integer> f1 = s -> s.length();
		Function<String, Integer> f2 = String::length; 
		
		//instance method 2
		Predicate<String> p3 = s -> s.isEmpty();
		Predicate<String> p4 = String::isEmpty; 
		
		//constructor
		Supplier<ArrayList<String>> p5 = () -> new ArrayList<>();
		Supplier<ArrayList<String>> p6 = ArrayList::new;
		
		//combined (instance method 1 & 2)
		BiPredicate<String, String> p7 = (str, prefix) -> str.startsWith(prefix);
		BiPredicate<String, String> p8 = String::startsWith;
		
		BiFunction<String, String, String> bf1 = (str, toAdd) -> str.concat(toAdd);
		BiFunction<String, String, String> bf2 = String::concat;		
	}

}
