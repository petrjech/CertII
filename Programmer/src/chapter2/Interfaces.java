package chapter2;

public class Interfaces {
	
	public interface A {
		public static int x1 = 10;
		static int x2 = 20;
		
		public void do1();
		public abstract void do2();
		void do3();
		abstract void do4();
		
		default void do5() {}
		public default void do6() {}
		
		static void do7() {}
		public static void do8() {}
	}
	
	public interface B extends A {
		public static int x1 = 10;
		static int x2 = 20;
		
		public void do1();
		public abstract void do2();
		void do3();
		abstract void do4();
		
		default void do5() {}
		public default void do6() {}
		
		static void do7() {}
		public static void do8() {}
	}

	public static void main(String[] args) {		

	}
}
