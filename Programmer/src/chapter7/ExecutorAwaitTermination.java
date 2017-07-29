package chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorAwaitTermination {

	public static void main(String[] args) {

		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			service.submit(() -> {
				System.out.println("task 1 start");
				try {
					Thread.sleep(1100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("task 1 end");
			});
			service.submit(() -> {
				System.out.println("task 2 start");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("task 2 end");
			});

		} finally {
			if (service != null)
				service.shutdown();
		}
		if (service != null) {
			try {
				service.awaitTermination(1, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (service.isTerminated())
				System.out.println("All tasks finished");
			else
				System.out.println("At least one task is still running");
		}

	}

}
