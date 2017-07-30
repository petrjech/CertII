package chapter8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableSample {

	public static class MySerializable implements Serializable {
		private static final long serialVersionUID = 1L;

		private class MyInnerClass implements Serializable {
			private static final long serialVersionUID = 1L;
			String mic;
			public MyInnerClass(String mic) {
				this.mic = mic;
			}
		}
		
		public MyInnerClass myMic = new MyInnerClass("mic");
		
		public void showMic() {
			System.out.println(myMic.mic);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		MySerializable ms = new MySerializable();
		
		File file = new File("test_dir\\temp");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			oos.writeObject(ms);
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			MySerializable ms2 = (MySerializable) ois.readObject();
			ms2.showMic();
		} catch (EOFException e) {
			// File end reached
		}
	}
}
