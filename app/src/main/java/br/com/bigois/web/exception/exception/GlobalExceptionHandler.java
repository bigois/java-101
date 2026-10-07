package br.com.bigois.web.exception.exception;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception exception) {
		JSONObject res = new JSONObject().put("message", exception.getMessage());
		return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body(res.toString());
	}
}
