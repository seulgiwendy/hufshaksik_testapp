package com.wheejuni.spring;

import org.json.simple.*;
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class KeyboardReturn {

	static JSONObject returnKeySet() {
		JSONObject returnKey = new JSONObject();
		ArrayList<String> keyList = new ArrayList<String>();
		keyList.add("인문관식당");
		keyList.add("교수회관식당");
		keyList.add("업데이트 일정 안내");

		returnKey.put("type", "buttons");
		returnKey.put("buttons", keyList);

		return returnKey;
	}

}
