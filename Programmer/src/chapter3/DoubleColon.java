package chapter3;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DoubleColon {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {

		//static method
		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = System.out::println;
		
		//instance method
		String myString = "abc";
		Predicate<String> p1 = s -> myString.startsWith(s);
		Predicate<String> p2 = myString::startsWith; 
		
		//instance method 2
		Predicate<String> p3 = s -> s.isEmpty();
		Predicate<String> p4 = String::isEmpty; 
		
		//constructor
		Supplier<ArrayList<String>> lambda4 = () -> new ArrayList<>();
		Supplier<ArrayList<String>> methodRef4 = ArrayList::new;
	}

}
