package chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicLong;

public class ForkJoinSapmleI {
	
	public static AtomicLong sum = new AtomicLong(0L);
	
	public static class MyRecursiveAction extends RecursiveAction {
		private static final long serialVersionUID = 1L;
		private int start, end;
		
		public MyRecursiveAction(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		protected void compute() {
			if (end - start > 25) {
				int middle = start + ((end - start) / 2);
				invokeAll(new MyRecursiveAction(start, middle), new MyRecursiveAction(middle, end));
			} else {
				try {
					Thread.sleep((end - start) * (end - start));
				} catch (InterruptedException ignore) {}
				for (int i = start; i < end; i += 1) {
					sum.addAndGet(i);
				}
				System.out.println("done " + start + " - " + end);
			}
		}
		
	}

	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		ForkJoinTask<?> task = new MyRecursiveAction(start, end); 
		ForkJoinPool pool = new ForkJoinPool(); 
		pool.invoke(task);
		System.out.println("sum is: " + (sum.get() + end));
		long sumShouldBe = (start + end) * (end - start + 1) / 2;
		System.out.println("sum should be: " + sumShouldBe);
	}

}
