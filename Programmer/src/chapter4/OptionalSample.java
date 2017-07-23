package chapter4;

import java.util.Optional;

public class OptionalSample {
	
	public static Optional<String> do1(String str) {	
		if (str.length() > 5) {
			return Optional.of(str.substring(0, 3) + "...");
		} else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		
		do1("popocatepetl").ifPresent(System.out::println);
		
		Optional<String> val1 = do1("popocatepetl");
		if (val1.isPresent()) {
			System.out.println("present!  " + val1.get());
		}
		
		System.out.println(do1("pop").orElse("N/A"));
		
		System.out.println(do1("pop").orElseGet(() -> "N/A"));
		
		try {
			System.out.println(do1("pop").orElseThrow(() -> new RuntimeException("Exception!")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		val1.filter( str -> str.contains("...")).ifPresent( s -> System.out.println("contains three dots"));
		
		val1.map( s -> s.length()).ifPresent(System.out::println);
		
		val1.flatMap( s -> Optional.of("new value")).ifPresent(System.out::println);
		
	}
}
