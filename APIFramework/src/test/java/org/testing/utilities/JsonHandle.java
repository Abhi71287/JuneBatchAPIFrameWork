package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONTokener;


public class JsonHandle {
	
//	Input Parameter ----Json File Path.
//	Purpose of the method ---- to load/read the Json file 
//	Output Parameter ---- Json data in String format.
	public static  String  loadJsonFile(String filePath) throws FileNotFoundException {
		File f = new File(filePath);
		FileInputStream fi= new FileInputStream(f);
		JSONTokener js =new JSONTokener(fi);
		JSONObject j = new JSONObject(js);
		return j.toString();
	}

}
