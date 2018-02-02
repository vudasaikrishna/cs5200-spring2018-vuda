package edu.northeastern.cs5200.controllers.hello;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/*@RequestMapping("/api/hello/string")
	public String sayHello() {
		return "Hello Sai Krishna Vuda!";
	}

	@RequestMapping("/api/hello/object")
	public HelloObject sayHelloObject() {
		return new HelloObject("Hello Sai Krishna Vuda!");
	}*/
	@Autowired
	HelloRepository helloRepository;
	
	@RequestMapping("/api/hello/insert")
	public HelloObject insertHelloObject() {
		HelloObject obj = new HelloObject("Hello Sai Krishna Vuda!");
		helloRepository.save(obj);
		return obj;
	}
	
	@RequestMapping("/api/hello/insert/{msg}")
	public HelloObject insertMessage(@PathVariable("msg") String message) {
		HelloObject obj = new HelloObject(message);
		helloRepository.save(obj);
		return obj;
	}
	
	@RequestMapping("/api/hello/select/all")
	public List<HelloObject> selectAllHelloObjects() {
		List<HelloObject> hellos = (List<HelloObject>) helloRepository.findAll();
		return hellos;
	}
}
