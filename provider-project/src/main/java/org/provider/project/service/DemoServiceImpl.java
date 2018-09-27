package org.provider.project.service;

import org.api.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello() {
		return "helloworld";
	}

}
