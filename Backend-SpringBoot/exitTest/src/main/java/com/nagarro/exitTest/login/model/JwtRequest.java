package com.nagarro.exitTest.login.model;


/**
 * The Class JwtRequest.
 */
public class JwtRequest {
	
	/** The username. */
	String username;
	
	/** The password. */
	String password;

	/**
	 * Instantiates a new jwt request.
	 */
	public JwtRequest() {

	}

	/**
	 * Instantiates a new jwt request.
	 *
	 * @param username the username
	 * @param password the password
	 */
	public JwtRequest(String username, String password) {
		this.username = username;
		this.password = password;

	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "JwtRequest [username=" + username + ", password=" + password + "]";
	}

}
