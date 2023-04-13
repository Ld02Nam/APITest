package springboot.group.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/a")
	public String byf() {return "hhh";
			
	}
}
