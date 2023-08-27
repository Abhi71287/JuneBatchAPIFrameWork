package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {

//	input Parameter ---The complete requestBody,variableName,variableValue.
//	Purpose Of the method --to assign the value to the variable.
//	output --requestBody with replaced Value.

	public static String assignVariableValue(String requestBody, String variableName, String variableValue) 
	{
     requestBody= requestBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
     return requestBody;
	}

}
