package com.nagarro.exitTest.login.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * The Class CustomUserDetails.
 */
public class CustomUserDetails implements UserDetails {

	/** The user. */
	private User user;

	/**
	 * Instantiates a new custom user details.
	 *
	 * @param user the user
	 */
	public CustomUserDetails(User user) {
//		super();
		this.user = user;
	}

	/**
	 * Gets the authorities.
	 *
	 * @return the authorities
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRol());

		return List.of(simpleGrantedAuthority);
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	@Override
	public String getPassword() {

		return user.getPassword();
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	@Override
	public String getUsername() {

		return user.getUsername();
	}

	/**
	 * Checks if is account non expired.
	 *
	 * @return true, if is account non expired
	 */
	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	/**
	 * Checks if is account non locked.
	 *
	 * @return true, if is account non locked
	 */
	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	/**
	 * Checks if is credentials non expired.
	 *
	 * @return true, if is credentials non expired
	 */
	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	/**
	 * Checks if is enabled.
	 *
	 * @return true, if is enabled
	 */
	@Override
	public boolean isEnabled() {

		return true;
	}

}
