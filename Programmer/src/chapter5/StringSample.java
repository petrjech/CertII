package chapter5;

public class StringSample {

	public static void main(String[] args) {

		String s1 = "bunny";
		String s2 = "bunny";
		String s3 = new String("bunny");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		String s4 = "1" + 2 + 3;
		String s5 = 1 + 2 + "3";
		System.out.println(s4);
		System.out.println(s5);

		String s = "abcde ";
		System.out.println(s.trim().length());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf("de"));
		System.out.println(s.substring(2, 4).toUpperCase());
		System.out.println(s.replace('a', '1'));
		System.out.println(s.contains("DE"));
		System.out.println(s);

		StringBuilder b = new StringBuilder();
		b.append(12345).append('-');
		System.out.println(b.length());
		System.out.println(b.indexOf("-"));
		System.out.println(b.charAt(2));

		StringBuilder b2 = b.reverse();
		System.out.println(b.toString());
		System.out.println(b == b2);

		StringBuilder sb = new StringBuilder("abcde");
		sb.insert(1, '-').delete(3, 4);
		System.out.println(sb);
		System.out.println(sb.substring(2, 4));
	}

}
