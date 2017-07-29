package chapter7;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueSample {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> bq = new LinkedBlockingQueue<>(2);
		
		bq.offer("first", 1, TimeUnit.SECONDS);
		bq.offer("second", 1, TimeUnit.SECONDS);
		bq.offer("third", 1, TimeUnit.SECONDS);

		while ( !bq.isEmpty() ) {
			System.out.println(bq.poll());
		}
		
		System.out.println("finnished");
		
		BlockingDeque<String> bd = new LinkedBlockingDeque<>(2);
		
		bd.offerFirst("first", 500, TimeUnit.MILLISECONDS);
		bd.offerFirst("second", 500, TimeUnit.MILLISECONDS);
		bd.offerFirst("third", 500, TimeUnit.MILLISECONDS);

		while ( !bd.isEmpty() ) {
			System.out.println(bd.pop());
		}
		
		System.out.println("finnished");
	}

}
