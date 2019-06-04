package org.bcm.webapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapp")
public class SpringController extends AbstractController {

	@GetMapping("/greeting")
	public ResponseEntity<? extends Object> getGreeting() {
		String body = "bcm_middleware: hello greeting";
		return responseEntity(body, HttpStatus.OK);
	}
}
