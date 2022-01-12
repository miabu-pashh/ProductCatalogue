package com.nagarro.exitTest.login.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nagarro.exitTest.login.model.CustomUserDetails;
import com.nagarro.exitTest.login.model.User;
import com.nagarro.exitTest.login.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	/**
	 * Load user by username.
	 *
	 * @param s the s
	 * @return the user details
	 * @throws UsernameNotFoundException the username not found exception
	 * 
	 * 
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Load user by username.
	 *
	 * @param userName the user name
	 * @return the user details
	 * @throws UsernameNotFoundException the username not found exception
	 */
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		final User user = this.userRepository.findByUsername(userName);

		if (user == null) {
			throw new UsernameNotFoundException("User not find re maibu !!!");

		} else {
			return new CustomUserDetails(user);
		}

	}
}
