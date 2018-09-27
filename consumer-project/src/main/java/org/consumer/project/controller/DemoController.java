package org.consumer.project.controller;

import org.api.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@GetMapping("/sayHello")
	public String sayHello() {
		return demoService.sayHello();

	}

}
