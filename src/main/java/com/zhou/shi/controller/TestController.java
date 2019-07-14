package com.zhou.shi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("2222");
		
		return "11113333";
	}
}
