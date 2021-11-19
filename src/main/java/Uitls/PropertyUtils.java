package Uitls;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {

	static Properties property = null;

	public PropertyUtils(){

		property = new Properties();

		// It will load the property file. We use this line of code to load any tyoe of file.
		try {
			InputStream input =	PropertyUtils.class.getClassLoader().getResourceAsStream("config.properties");
			property.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String Getproperty(String key) {
		if(key.isBlank()) {
			System.out.println("Key can not be null");
		}

//		if(!System.getenv(key).isEmpty()) {
//			return System.getenv(key);
//		}

		if(property.getProperty(key).isEmpty()) {
			System.out.println("Value can not be null");
		}
		return property.getProperty(key);
	}
	
	public static PropertyUtils getInstance() {
		PropertyUtils utils = new PropertyUtils();
		return utils;
	}

}
