package org.bcm.webapp.controller;

import org.bcm.utility.constants.UrlConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = UrlConstant.WEBAPP)
public class SpringController extends AbstractController {

	private static final Logger log = LoggerFactory.getLogger(SpringController.class);

	@GetMapping(value = UrlConstant.WEBAPP_GREETING)
	public ResponseEntity<? extends Object> getGreeting() {
		log.info("bcm_webapp_mw: webapp_greeting executed ..........");
		String body = "bcm_middleware: hello greeting";
		return responseEntity(body, HttpStatus.OK);
	}
}
