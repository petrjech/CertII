package chapter6;

public class SuppressedException implements AutoCloseable {
	
	public static class MyCheckedException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	@Override
	public void close() throws MyCheckedException {
		throw new MyCheckedException();		
	}

	public static void main(String[] args) {

		try (SuppressedException sp = new SuppressedException();) {
			int fault = 5/0;
			System.out.println(fault);
		} catch (MyCheckedException e) {
			e.printStackTrace();
		}

	}
}
