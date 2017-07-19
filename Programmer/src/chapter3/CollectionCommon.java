package chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionCommon {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		
		list.add("a");
		set.add("a");
		queue.add("a");
		
		list.remove("a");
		set.remove("a");
		queue.remove("a");
		
		list.isEmpty();
		set.isEmpty();
		queue.isEmpty();
		
		list.size();
		set.size();
		queue.size();
		
		list.contains("a");
		set.contains("a");
		queue.contains("a");
		
		list.clear();
		set.clear();
		queue.clear();
	}
}
