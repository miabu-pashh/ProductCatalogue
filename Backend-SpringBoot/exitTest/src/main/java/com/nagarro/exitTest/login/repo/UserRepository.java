package com.nagarro.exitTest.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.exitTest.login.model.User;

/**
 * The Interface UserRepository.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Find by username.
	 *
	 * @param username the username
	 * @return the user
	 */
	// username, it will return the user of given username
	public User findByUsername(String username);

}
