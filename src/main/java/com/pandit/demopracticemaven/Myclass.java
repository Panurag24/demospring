package com.pandit.demopracticemaven;

import org.springframework.web.bind.annotation.*;

@RestController
public class Myclass {
	
	@GetMapping("abc")
	public String sayhello() {
		return "Hello";
	}

}
