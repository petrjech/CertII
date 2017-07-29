package chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSampleII {
	
	public static class MyRecursiveTask extends RecursiveTask<Long> {
		private static final long serialVersionUID = 1L;
		private int start, end;
		
		public MyRecursiveTask(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		protected Long compute() {
			long sum = 0;
			if (end - start > 25) {
				int middle = start + ((end - start) / 2);
				MyRecursiveTask task1 = new MyRecursiveTask(start, middle);
				task1.fork();
				sum = new MyRecursiveTask(middle, end).compute();
				sum += task1.join();
			} else {
				try {
					Thread.sleep((end - start) * (end - start));
				} catch (InterruptedException ignore) {}
				for (int i = start; i < end; i += 1) {
					sum += i;
				}
				System.out.println("done " + start + " - " + end);				
			}
			return sum;
		}		
	}
	
	public static void main(String[] args) {
		int start = 0;
		int end = 900;
		ForkJoinTask<Long> task = new MyRecursiveTask(start, end); 
		ForkJoinPool pool = new ForkJoinPool();
		Long sum = pool.invoke(task);
		System.out.println("sum is: " + (sum + end));
		long sumShouldBe = (start + end) * (end - start + 1) / 2;
		System.out.println("sum should be: " + sumShouldBe);
	}

}
