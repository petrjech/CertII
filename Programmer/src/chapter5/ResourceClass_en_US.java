package chapter5;

import java.time.Duration;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceClass_en_US extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { 
			{ "hello", "Hello there!" }, 
			{ "open", Duration.ofHours(8) }
		};
	}

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("chapter5.ResourceClass", Locale.US);
		System.out.println(rb.getObject("hello"));
	}
}

