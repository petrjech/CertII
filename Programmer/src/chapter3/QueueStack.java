package chapter3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueStack {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();      // FIFO
		ArrayDeque<String> stack = new ArrayDeque<>(); // FILO
		Deque<String> deque = new ArrayDeque<>(); 
		
		System.out.println( queue.offer("two"));  // same as add - preferable
		System.out.println( queue.add("one"));    // same as offer (throw exception on fail)
		
		System.out.println( queue.peek());        // empty queue returns null - preferable
		System.out.println( queue.element());     // empty queue throws exception
		
		System.out.println( queue.poll());        // empty queue returns null - preferable
		System.out.println( queue.remove());      // empty queue throws exception
		
		System.out.println( queue );

		// not Queue methods
		System.out.println("***");
		stack.push("three");
		stack.push("four");
		System.out.println( stack.pop() );
		System.out.println( stack );
		
		System.out.println("***");
		
		deque.add("one");
		System.out.println(deque);
		deque.offerFirst("two");
		System.out.println(deque);
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		deque.offerLast("three");
		System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque);
		deque.push("four");
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque);
	}

}
