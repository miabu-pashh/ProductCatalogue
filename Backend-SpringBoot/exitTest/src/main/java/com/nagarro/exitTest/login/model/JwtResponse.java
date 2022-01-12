package com.nagarro.exitTest.login.model;

public class JwtResponse {
	String token;

	/**
	 * Instantiates a new jwt response.
	 */
	public JwtResponse() {

	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public JwtResponse(String token) {
		super();
		this.token = token;
	}

}
