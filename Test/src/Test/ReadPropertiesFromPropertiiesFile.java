package Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFromPropertiiesFile {

	public static void main(String[] args) {
		ReadPropertiesFromPropertiiesFile file = new ReadPropertiesFromPropertiiesFile();
		file.getProperties();
		
		
	}
	public void getProperties(){
			InputStream fileInput = getClass().getResourceAsStream("/test.properties");
			Properties properties = new Properties();
			try {
				properties.load(fileInput);
			} catch (IOException e) {
			}
			
			System.out.println(properties.getProperty("abcd.xyz"));
	
			Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + ": " + value);
			}
	}
}
