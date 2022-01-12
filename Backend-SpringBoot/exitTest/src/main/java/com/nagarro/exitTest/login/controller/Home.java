package com.nagarro.exitTest.login.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Home {

	@RequestMapping("/welcome")
	public String welcome() {

		String text = "this is private pageyou are accesessing";
		return text;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	@RequestMapping("/getusers")
	public String getUser() {

		return "{\"name\":\"xyz\"}";
	}

}
