package com.examen.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping(path = "msgBienvenido")
	public ResponseEntity<Map<String, String>> msgBienvenido() {
		Map<String, String> json = new HashMap<>();
		json.put("data", "Bienvenido Candidato");
		return new ResponseEntity<Map<String, String>>(json, HttpStatus.OK);
	}
	
	@GetMapping(path = "versionApp")
	public ResponseEntity<Map<String, String>> versionApp() {
		Map<String, String> json = new HashMap<>();
		json.put("data", "App v0.1");
		return new ResponseEntity<Map<String, String>>(json, HttpStatus.OK);
	}
}
