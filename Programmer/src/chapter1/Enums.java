package chapter1;

public class Enums {

	public static enum SimpleEnum {
		One, Two, Thre;
		
		public static void printElements() {
			SimpleEnum[] values = SimpleEnum.values();
			for (SimpleEnum value : values) {
				value.print();
			}
		}
		
		public void print() {
			System.out.println("= " + this + " =");
		}
	}
	
	public static enum FullEnum {
		One(true), Two(false), Three(true);
		
		private boolean odd;
		
		private FullEnum(boolean b) {
			odd = b;
		}
		
		public boolean isOdd() {
			return odd;
		}
	}
	
	public static void main(String[] args) {
		
		SimpleEnum.printElements();
		
		SimpleEnum s1 = SimpleEnum.One;		
		FullEnum f1 = FullEnum.One;
		
		s1.print();		
		System.out.println(f1.isOdd());
	}
}
