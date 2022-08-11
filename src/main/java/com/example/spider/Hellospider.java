package com.example.spider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellospider {
	@RequestMapping("/")
	public String Spider() {
		return "Spider";
	}

}
