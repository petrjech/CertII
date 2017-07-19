package chapter1;

public class Enums {

	public static enum simpleEnum {
		One, Two, Thre;
		
		public void print() {
			System.out.println("= " + this + " =");
		}
	}
	
	public static enum fullEnum {
		One(true), Two(false), Three(true);
		
		private boolean odd;
		
		private fullEnum(boolean b) {
			odd = b;
		}
		
		public boolean isOdd() {
			return odd;
		}
	}
	
	public static void main(String[] args) {
		
		simpleEnum s1 = simpleEnum.One;		
		fullEnum f1 = fullEnum.One;
		
		s1.print();		
		System.out.println(f1.isOdd());
	}
}
