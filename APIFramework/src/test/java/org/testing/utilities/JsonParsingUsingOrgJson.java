package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;

public class JsonParsingUsingOrgJson {

//	input Parameter --- Complete resposeBody and keyName
//	purpose -

	public static String jsonParse(String responseBody, String keyName) {
		if (responseBody.startsWith("[")) {
			JSONArray array = new JSONArray(responseBody);
			int l = array.length();
			for (int i = 0; i < l; i++) {
				JSONObject ob = array.getJSONObject(i);
				System.out.println(ob.get(keyName));
			}
			return null;
		} else if (responseBody.startsWith("{")) {
			JSONObject j = new JSONObject(responseBody);
			String responseId = j.getString(keyName);
			return responseId;
		}else if(responseBody.startsWith("{")) {
			JSONObject j = new JSONObject(responseBody);
			String responseId = j.getString(keyName);
			
		}
		return null;

	}
}
