package chapter1;

public class Equals {
	
	public static class MyObject {
		private String identifier;
		public MyObject(String identifier) {
			this.identifier = identifier;
		}
		
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof MyObject)) {
				return false;
			}
			return identifier.equals(((MyObject) o).identifier);
		}
	}

	public static void main(String[] args) {
		MyObject m1 = new MyObject("my 1");
		assert m1.equals(new MyObject("my 1"));
		System.out.println(m1.equals(new MyObject("my 1")));
		System.out.println(m1.equals(new MyObject("not same")));
		System.out.println(m1.equals((Object) new MyObject("my 1")));
		Object o = new Object();
		System.out.println(m1.equals(o));
		System.out.println(m1.equals(null));
	}

}
