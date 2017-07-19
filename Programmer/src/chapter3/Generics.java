package chapter3;

public class Generics {
	
	public static class Aclass<T> {}
	
	public interface Binterface<T> {}

	public static class Cclass<T> implements Binterface<T> {}
	
	public static class Dclass implements Binterface<String> {}
	
	public static class Eclass {
		public <T> void do1(T t) {}
		public <T> T do2(T t) { return t;}
		public <T,U> T do3 (T t, U u) { return t; }
	}
	
	public static void main(String[] args) {
		Eclass e = new Eclass();
		e.do1("a");
		e.<String>do1("a");
		
		e.do2("a");
		e.<String>do2("a");
		
		Dclass d = new Dclass();
		
		Cclass<String> c = new Cclass<>();
		
		Binterface<String> b = c;
		
		Aclass<String> a = new Aclass<>();
		
		System.out.println(" * " + d + " * " + c + " * " + b + " * " + a);
	}
}
