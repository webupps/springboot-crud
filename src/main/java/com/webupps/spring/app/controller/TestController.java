package com.webupps.spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
	
	public class DemoController {

	    @GetMapping("/hello")
	    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
	        return String.format("Hello %s!", name);
	    }
	}
}
