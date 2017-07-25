package chapter7;

public class RunableSample {

	public static class MyRunnable implements Runnable {
		private String str;
		
		public MyRunnable(String s) {
			str = s;
		}
		
		@Override
		public void run() {
			System.out.println(str);
		}
	}
	
	public static class MyThread extends Thread {
		private String str;
		
		public MyThread(String s) {
			str = s;
		}
		
		@Override
		public void run() {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i += 1) {
			new Thread( new MyRunnable("my runnable" + i) ).start();
			new Thread( () -> System.out.println("my lambda")).start();
			new MyThread("my thread" + i).start();
			
		}
	}

}
