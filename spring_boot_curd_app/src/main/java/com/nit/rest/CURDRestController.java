package com.nit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CURDRestController {
	
	@GetMapping("/register")
	public String userRegister() {
		return "User register sucessfull";
	}

}
