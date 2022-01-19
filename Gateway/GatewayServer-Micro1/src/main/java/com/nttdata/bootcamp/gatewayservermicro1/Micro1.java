package com.nttdata.bootcamp.gatewayservermicro1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro1 {

	@GetMapping(path = "/micro1")
	public String helloMicro1() {
		return "Hola micro1";
	}

}
