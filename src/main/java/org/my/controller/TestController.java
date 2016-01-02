package org.my.controller;

import java.util.Map;

import org.my.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
	@Autowired
	private TestService service;
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> insert(String key, String field, String value) {
		return service.insert(key, field, value);
	}
	
}
