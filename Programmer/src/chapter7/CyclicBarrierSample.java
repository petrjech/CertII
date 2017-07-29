package chapter7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierSample {
	
	public static class MyTask implements Runnable {
		private int id;
		private CyclicBarrier cb;
		
		public MyTask(int id, CyclicBarrier cb) {
			this.id = id;
			this.cb = cb;
		}
		
		@Override
		public void run() {
			System.out.println("task start " + id);
			try {
				Thread.sleep((long) (Math.random() * 1500 + 500));
				System.out.println("task waits " + id);
				cb.await();
				System.out.println("task finnished " + id);
			} catch (InterruptedException | BrokenBarrierException ignore) {
				System.out.println("exception");
			}
			
		}
	}

	public static void main(String[] args) {
		
		// If you are using a thread pool, make sure that you set the number of available threads to be at least as large as your CyclicBarrier limit value!
		ExecutorService es = Executors.newFixedThreadPool(4);
		CyclicBarrier cb = new CyclicBarrier(4, () -> System.out.println("barrier done"));
		es.execute(new MyTask(1, cb));
		es.execute(new MyTask(2, cb));
		es.execute(new MyTask(3, cb));
		es.execute(new MyTask(4, cb));
		if (es != null) {
			es.shutdown();
		}
		System.out.println("finnish");
	}
}
