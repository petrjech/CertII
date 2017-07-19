package chapter1;

import chapter1.SecondClass.MemberClass;
import chapter1.SecondClass.StaticNestedClass;

public class NestedClass {
	
	static void callPrint(MemberClass mc) {
		mc.printX();
	}
	
	public static void main(String[] args) {
		SecondClass sc = new SecondClass();
		StaticNestedClass snc = new StaticNestedClass();
		// or SecondClass.StaticNestedClass snc = new StaticNestedClass();
		MemberClass mc = sc.new MemberClass();
		
		System.out.println(StaticNestedClass.x + " " + snc);
		mc.printX();
		callPrint(sc.new MemberClass() {
			//anonymous inner class
			@Override
			public void printX() {
				System.out.println("overrided printX prints nothing");
			}
		});
	}

}

class SecondClass {
	private String x = "10";
	
	public static class StaticNestedClass {
		//The nesting creates a namespace because the enclosing class name must be used to refer to it.
		//It can be made private or use one of the other access modifiers to encapsulate it.
		//The enclosing class can refer to the fields and methods of the static nested class.
		public static String x = "20";
	}
	
	private interface MyInterface {
		
	}
	
	protected class MemberClass implements MyInterface {	
		//Can be declared public, private, or protected or use default access
		//Can extend any class and implement interfaces
		//Can be abstract or final
		//Cannot declare static fields or methods
		//Can access members of the outer class including private members
		private String x = "30";
		
		protected void printX() {
			
			class LocalInnerClass {
				//They do not have an access specifier. 
				//They cannot be declared static and cannot declare static fields or methods. 
				//They have access to all fields and methods of the enclosing class. 
				//They do not have access to local variables of a method unless those variables are final or effectively final. More on this shortly. 
				void innerPrintX() {
					System.out.println(x);
					System.out.println(SecondClass.this.x);
					System.out.println(StaticNestedClass.x);
				}
			};
			
			LocalInnerClass lic = new LocalInnerClass();
			lic.innerPrintX();
		}
	}
	

	
}