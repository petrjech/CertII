package chapter3;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueStack {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();      // FIFO
		ArrayDeque<String> stack = new ArrayDeque<>(); // FILO
		
		System.out.println( queue.offer("two"));  // same as add - preferable
		System.out.println( queue.add("one"));    // same as offer (throw exception on fail)
		
		System.out.println( queue.peek());        // empty queue returns null - preferable
		System.out.println( queue.element());     // empty queue throws exception
		
		System.out.println( queue.poll());        // empty queue returns null - preferable
		System.out.println( queue.remove());      // empty queue throws exception
		
		System.out.println( queue );
		
		// not Queue methods
		stack.push("three");
		stack.push("four");
		System.out.println( stack.pop() );
		System.out.println( stack );

	}

}
