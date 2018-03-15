package com.ludan.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("hi")
	public String holleworld(String name) {
		
		return "本次访问的端口号是："+port;
	}
}
