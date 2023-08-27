package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {
	
//	Input Parameter--- File Path
//	purpose of the method --- to load the properties file.
//	output parameter --- object of properties class 
	
	public static Properties loadPropertiesFile(String filePath) throws IOException {
		File f =new File(filePath);
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		return pr;
		
		
	}

}
