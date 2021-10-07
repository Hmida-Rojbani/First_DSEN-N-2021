package de.tekup.first.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.models.User;
import de.tekup.first.services.HelloService;

@RestController
public class HelloCtrl {

	private HelloService service;
	// injection
	public HelloCtrl(HelloService service) {
		super();
		this.service = service;
	}

	//@RequestMapping(path = "/hello", method = {RequestMethod.GET,RequestMethod.POST})
	@GetMapping("/hello")
	public String sayHello() {
		return service.hello();
	}

	@RequestMapping(path = "/hello/{value}")
	public ResponseEntity<String>  sayHello(@PathVariable("value") String name) {
		return new ResponseEntity<String>(service.helloName(name), HttpStatus.ACCEPTED) ;
	}
	
	@PostMapping("/user/save")
	public User saveUser(@RequestBody User user) {
		user.setAge(50);
		return user;
	}

}
