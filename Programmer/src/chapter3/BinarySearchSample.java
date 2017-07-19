package chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchSample {

	public static void main(String[] args) {
		String[] array = {"fox", "beetle", "zebra", "dog"};
		List<String> list = Arrays.asList(Arrays.copyOf(array, array.length));
		
		System.out.println(Arrays.asList(array));
		System.out.println(list);
		
		Arrays.sort(array);
		Collections.sort(list);
		
		System.out.println(Arrays.asList(array));
		System.out.println(list);
		
		System.out.println(Arrays.binarySearch(array, "dog"));
		System.out.println(Arrays.binarySearch(array, "aligator"));
		// if not found returns index where the value should be put and negates it and minus one (0 * -1) - 1 = -1 
		
		System.out.println(Arrays.binarySearch(array, "snake")); 
		//  (3 * -1) * -1 = -4
		
		System.out.println(Collections.binarySearch(list, "dog"));
		System.out.println(Collections.binarySearch(list, "aligator"));
		System.out.println(Collections.binarySearch(list, "snake"));
	}

}
