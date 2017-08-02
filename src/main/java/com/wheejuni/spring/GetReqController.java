package com.wheejuni.spring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

@RestController
public class GetReqController {
	@RequestMapping(value = "/keyboard", method = RequestMethod.GET)
	public String getKeyboard() {

		JSONObject keyboardJSON = new JSONObject();
		keyboardJSON = KeyboardReturn.returnKeySet();
		return keyboardJSON.toString();

	}

	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String postMessage(@RequestBody String content) throws Exception {
		JSONParser jp = new JSONParser();
		JSONObject msgJSON = new JSONObject();
		JSONObject reqJSON = new JSONObject();
		Object parse = jp.parse(content);
		reqJSON = (JSONObject) parse;
		msgJSON = MsgHandler.readMessage(reqJSON.get("content").toString());
		return msgJSON.toString();
	}

}
