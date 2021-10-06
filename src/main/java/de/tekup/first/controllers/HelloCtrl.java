package de.tekup.first.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.services.HelloService;

@RestController
public class HelloCtrl {
	

	private HelloService service;
// injection
	public HelloCtrl(HelloService service) {
		super();
		this.service = service;
	}

	@RequestMapping(path = "/hello")
	public String sayHello() {
		return service.hello();
	}

	@RequestMapping(path = "/hello/{value}")
	public String sayHello(@PathVariable("value") String name) {
		return service.helloName(name);
	}

}
