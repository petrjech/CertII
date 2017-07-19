package chapter2;

import java.util.function.Predicate;

public class PredicateSample {
	
	public static class MyTestable {
		
		private String s;
		
		public MyTestable(String s) {
			this.s = s;
		}
		
		public void printTestResult(Predicate<MyTestable> p) {
			if (p.test(this)) {
				System.out.println("test passed");
			} else {
				System.out.println("test not passed");
			}
				
		}
	}
	
	public static void main(String[] args) {
		
		MyTestable mt1 = new MyTestable("mt1");		
		
		Predicate<MyTestable> p1 = s -> !s.s.isEmpty();
		Predicate<MyTestable> p2 = t -> { return !t.s.isEmpty(); };
		Predicate<MyTestable> p3 = (u) -> { return !u.s.isEmpty(); };
		Predicate<MyTestable> p4 = (MyTestable v) -> { return !v.s.isEmpty(); };
		
		mt1.printTestResult(x -> !x.s.isEmpty());
		mt1.printTestResult(p1);
		mt1.printTestResult(p2);
		mt1.printTestResult(p3);
		mt1.printTestResult(p4);
	}

}
