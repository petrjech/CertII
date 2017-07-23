package chapter4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamPrimitives {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		IntStream is;
		LongStream ls;
		DoubleStream ds;
		
		IntStream is1 = IntStream.empty();
		IntStream is2 = IntStream.of(1, 2, 3, 5, 7, 11);
		IntStream is3 = IntStream.range(10, 20);
		IntStream is4 = IntStream.rangeClosed(10, 19);
		IntStream is5 = IntStream.iterate(100, n -> n + 10);
		
		DoubleStream ds1 = DoubleStream.generate(Math::random);
		
	}

}
