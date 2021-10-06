package de.tekup.first.services;

import org.springframework.stereotype.Service;

// Business Logic
@Service
public class HelloService {
	
	
	public String hello() {
		return "<h1>Hello world !!!</h1>";
	}
	
	public String helloName(String name) {
		return "<h1>Hello "+name+" !!!</h1>";
	}

}
