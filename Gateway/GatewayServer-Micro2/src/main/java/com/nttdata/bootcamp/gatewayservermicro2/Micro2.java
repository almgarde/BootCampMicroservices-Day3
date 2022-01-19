package com.nttdata.bootcamp.gatewayservermicro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro2 {

	@GetMapping(path = "/micro2")
	public String helloMicro2() {
		return "Hola micro2";
	}

}
