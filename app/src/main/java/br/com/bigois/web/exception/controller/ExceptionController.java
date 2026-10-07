package br.com.bigois.web.exception.controller;

import jakarta.persistence.EntityNotFoundException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/exception", produces = MediaType.APPLICATION_JSON_VALUE)
public class ExceptionController {
	@GetMapping(path = "/ok", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getOK() {
		JSONObject res = new JSONObject().put("message", "OK");
		return ResponseEntity.ok(res.toString());
	}

	@GetMapping(path = "/entityNotFound", produces = MediaType.APPLICATION_JSON_VALUE)
	public void throwEntityNotFoundException() {
		JSONObject res = new JSONObject();
		res.put("message", "Entity found");
		throw new EntityNotFoundException("Entity not found");
	}
}
