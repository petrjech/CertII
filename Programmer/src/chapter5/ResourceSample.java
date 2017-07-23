package chapter5;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceSample {

	public static void main(String[] args) {

		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("Programmer", us);
		System.out.println(rb.getString("hello"));

		Set<String> keys = rb.keySet();
		keys.forEach(k -> System.out.println(k + "=" + rb.getString(k)));
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		
		System.out.println(props.getProperty("notReallyAProperty"));
		System.out.println(props.getProperty("notReallyAProperty", "123"));

	}

}
