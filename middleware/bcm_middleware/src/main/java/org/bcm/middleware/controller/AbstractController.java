package org.bcm.middleware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class AbstractController {

	public ResponseEntity<? extends Object> responseEntity(Object body, HttpStatus status) {
		return new ResponseEntity<Object>(body, status);
	}
}
