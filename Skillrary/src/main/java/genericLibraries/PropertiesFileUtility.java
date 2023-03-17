package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/* This class contains reusable methods to perform 
 * operations on the Properties file
 */
public class PropertiesFileUtility {
	private Properties property;
//This method is used to initialize properties file
	public void propertiesInitialization(String path) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
//This method is used to get data from the properties file
	public String fetchData(String key) {
		return property.getProperty(key);

	}

}
