package com.exercise.token.model;

public class Token {
	private String token;
	//Constructor - change the name of the variable (don't make a confusion)
	public Token(String str) {
		this.token = str;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
