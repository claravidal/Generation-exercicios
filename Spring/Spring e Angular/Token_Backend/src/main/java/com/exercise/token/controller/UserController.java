package com.exercise.token.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.token.model.Student;
import com.exercise.token.model.Token;
import com.exercise.token.model.User;
import com.exercise.token.util.Autenticator;




@CrossOrigin("*")
@RestController

public class UserController {

	@PostMapping("/autenticate")
	public ResponseEntity<Token> autenticate(@RequestBody User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		if (user.getUsername().equals("user") && user.getPassword().equals("0000")) {
			System.out.println(Autenticator.encode(user));
			return ResponseEntity.ok(new Token(Autenticator.encode(user)));
		}
		return ResponseEntity.status(403).build();
	}
		
		@GetMapping("/students/all")
		public ResponseEntity<ArrayList<Student>> getStudents(@RequestParam String token) {
			try {
				if (Autenticator.isValid(token)) {
					ArrayList<Student> lista = new ArrayList<>();
					for (int i = 0; i < 10; i++) {
						lista.add(new Student(i, "Aluno " + i, "aluno" + i + "@aluno.com.br"));
					}
					return ResponseEntity.ok(lista);
				}
				return ResponseEntity.status(403).build();
			} catch (Exception ex) {
				return ResponseEntity.status(400).build();
			}
		}
	}



